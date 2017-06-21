package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Users;

@RestController
public class UserController {

	@Autowired
	private Users dao;

	@RequestMapping("/user")
	public String user(){
		return dao.getUserById(1l).toString();
	}
}
