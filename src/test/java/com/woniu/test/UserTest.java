package com.woniu.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.woniu.pojo.User;

public class UserTest {

	@Test
	public void test() {
		InputStream is = UserTest.class.getResourceAsStream("/configuration.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = build.openSession();
		List<User> list = session.selectList("findAll");
		for (User user : list) {
			System.out.println(user);
		}
		User u=session.selectOne("findOne",1);
		System.out.println(u);
		session.close();
	}

}
