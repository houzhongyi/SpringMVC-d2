package com.icss.ys.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.icss.ys.user.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	public boolean requestInsert(){
		return service.insert();
	}
}
