package com.moonsea.useraccounts.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonsea.useraccounts.repos.UserBeanRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserBeanRepo urp;
	
	@Override
	public int getActiveCount() {
		
		List<String> list = new ArrayList<>();
		list.add("bikeshkumar");
		
		return urp.findByUsernameIn(list).size();
	}

}
