package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;



@RestController
@RequestMapping("/Commands")
public class CommandsController {
	
	@Autowired
	private UserService userService;


}
