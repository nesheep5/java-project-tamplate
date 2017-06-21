package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.dao.UserDao;
import com.example.demo.repository.dao.UserDaoImpl;
import com.example.demo.repository.entity.User;

@Component
public class Users {

	@Autowired
	UserDao userDao = new UserDaoImpl();

	public User getUserById(long id) {
		return userDao.selectById(id);
	}
}
