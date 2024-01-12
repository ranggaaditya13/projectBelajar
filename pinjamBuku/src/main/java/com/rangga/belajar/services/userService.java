package com.rangga.belajar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.rangga.belajar.models.bukuModel;
import com.rangga.belajar.models.userModel;
import com.rangga.belajar.repositories.bukuRepository;
import com.rangga.belajar.repositories.userRepository;

@Service
@Transactional
public class userService {
	private List<userModel> userList = new ArrayList<userModel>();
	
	@Autowired
	private userRepository ur;
	
	@Autowired
	private bukuRepository br;
	
	public List<userModel> dataAll(){
		return ur.findAll();
	}
	
	public userModel tambahUser( userModel user) {
		userModel temp = new userModel();
		temp.setNama(user.getNama());
		temp.setNomor_telepon(user.getNomor_telepon());
		temp.setId_buku(0);
		return ur.save(temp);
	}
	
	 public List<userModel> getUserByBirthYearMore(int birthYear) {
	        return ur.findAll()
	        		.stream()
	        		.filter(usermodel -> usermodel.getTahun_lahir() != birthYear && usermodel.getTahun_lahir() > birthYear)
	        		.collect(Collectors.toList());
	    }
	 
	 
}
