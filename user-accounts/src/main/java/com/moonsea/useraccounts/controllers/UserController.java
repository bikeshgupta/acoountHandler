package com.moonsea.useraccounts.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonsea.useraccounts.bean.UserBean;
import com.moonsea.useraccounts.bean.UserDetails;
import com.moonsea.useraccounts.dto.CommonDTO;
import com.moonsea.useraccounts.repos.UserBeanRepo;
import com.moonsea.useraccounts.repos.UserDeatilsRepo;

@RestController
public class UserController {
	
	@Autowired
	private UserBeanRepo userRepo;
	
	@Autowired
	private UserDeatilsRepo udr;
	
	@GetMapping("/test")
	public String test() {
		return "PASS!!";
	}
	
	@GetMapping("/insertData")
	public String insertDefaultData() {
		String result=null;
		UserBean user = new UserBean();
		userRepo.save(user);
		
		return result;
	}
	
	@GetMapping("/findAllUsers")
	public List<UserBean> getUserData() {
		return userRepo.findAll();
	}
	
	@GetMapping("/all")
	public List<UserDetails> getUserDetailsData() {
		return udr.findAll();
	}
	
	
	
	@PostMapping("/login")
	public CommonDTO authenticateUser(@RequestBody UserBean user) {
		CommonDTO commonDTO =new CommonDTO();
		if("test".equals(user.getUsername())) {
			commonDTO.setStatus("SUCCESS");
		}
		return commonDTO;
	}
	
	@PutMapping("/createUser")
	public Long createNewUser(@RequestBody UserBean user) {
		userRepo.save(user);
		return user.getId();
	}
	
	@PutMapping("/updateUser")
	public UserBean updateUser(@RequestBody UserBean user) {
		userRepo.save(user);
		return user;
	}
	
	@GetMapping("/findUser/{id}")
	public UserBean getUserData(@PathVariable Long id) {
		Optional<UserBean> data= userRepo.findById(id);
		return data.isPresent()?null:data.get();
	}

}
