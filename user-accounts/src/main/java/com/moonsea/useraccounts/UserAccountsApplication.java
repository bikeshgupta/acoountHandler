package com.moonsea.useraccounts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.moonsea.useraccounts.bean.Address;
import com.moonsea.useraccounts.bean.UserBean;
import com.moonsea.useraccounts.bean.UserDetails;
import com.moonsea.useraccounts.repos.UserBeanRepo;
import com.moonsea.useraccounts.repos.UserDeatilsRepo;

@SpringBootApplication
public class UserAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner usreCreation(UserBeanRepo ubr,UserDeatilsRepo udr ) {
		return strings -> {
			UserBean user = new UserBean("Bikesh","kumar", "Gupta","bikeshkumar","L-2", true,"123");	
			Address ad1 = new Address("121", "DMR", "Mou", "Mpur", "WS", "JH", 12345L);
			Address ad2 = new Address("122", "DMR", "Mou", "Mpur", "WS", "JH", 12345L);
			UserDetails udtls = new UserDetails("111111111", "2222222-1", "PAN", "PANNumber","ABC",1L);
			List<Address> adds = new ArrayList<>();
			ad1.setUser(user);
			ad2.setUser(user);
			adds.add(ad1);
			adds.add(ad2);
			
			user.setAddress(adds);
			udtls.setUser(user);
			user.setUserDeatils(udtls);
			ubr.save(user);

			
			//ubr.save(new UserBean("Rakesh","kumar", "Gupta","Rakeshkumar","L-3", true,"123"));
		};
	}
	
	/*@Bean
	CommandLineRunner usreDetails(UserDeatilsRepo udr) {
		return strings -> {
			udr.save(new UserDetails("111111111", "2222222-1", null, "PAN", "PANNumber","ABC",1L));
			udr.save(new UserDetails("111111111", "2222222-2", null, "PAN1", "PANNumber1","ABC",2L));
		};
	}
*/
}
