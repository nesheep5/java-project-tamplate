package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloThymeLeafController {

	@RequestMapping("/test")
	public String hello(Model m) {
		m.addAttribute("msg", "ThymeLeaf");
		return "test/hello";
	}
}
