package com.rangga.belajar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.belajar.models.userModel;
import com.rangga.belajar.services.userService;

@RestController
public class userController {
	
	@Autowired
	private userService us;
	
	@GetMapping("/user")
	public List<userModel> dataAll(){
		return us.dataAll();
	}

	@PostMapping("/user")
	public userModel tambahUser(@RequestBody userModel user) {
		return us.tambahUser(user);
	}
	
	@RequestMapping("/user/{tahun_lahir}")
	public List<userModel> getDataByMoreYears(@PathVariable int tahun_lahir){
		return us.getUserByBirthYearMore(tahun_lahir);
	}
	
	
	
}
