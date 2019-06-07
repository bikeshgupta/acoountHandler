package com.moonsea.useraccounts.schedulars;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.moonsea.useraccounts.services.UserService;

@Configuration
@EnableScheduling
public class TestSchedular {
	
	@Autowired
	UserService userService;

	@Scheduled(fixedRate = 3000L)
	public void getActiveUsers() {
		System.err.println("Records : " + userService.getActiveCount() + " on " + new Date());
	}
}
