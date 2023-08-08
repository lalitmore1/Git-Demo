package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Devices;
import com.example.demo.service.DevicesService;



@RestController
@RequestMapping("/Device")
public class DevicesController  {
	
	@Autowired
	private DevicesService  devicesService;
	
	
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Devices> saveDevices(@RequestBody Devices device) {
		
		 Devices dev=devicesService.saveDevice(device);
		
		 return ResponseEntity.ok().body(dev);
	
	}}
	
	
	


