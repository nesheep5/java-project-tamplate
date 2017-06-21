package com.example.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.repository.dao.UserDao;
import com.example.domain.repository.entity.User;

@Component
public class Users {

	@Autowired
	private UserDao userDao;

	public User getUserById(long id) {
		return userDao.selectById(id);
	}
}
