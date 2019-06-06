package com.moonsea.useraccounts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moonsea.useraccounts.bean.UserDetails;

public interface UserDeatilsRepo extends JpaRepository<UserDetails, Long> {
}
