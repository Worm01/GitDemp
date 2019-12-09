package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserMapper {
	List<User> findAll();
	User findOne(Integer uid);
}
