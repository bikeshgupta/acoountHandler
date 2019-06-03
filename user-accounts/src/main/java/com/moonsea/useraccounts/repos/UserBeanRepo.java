package com.moonsea.useraccounts.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moonsea.useraccounts.bean.UserBean;

@Repository
public interface UserBeanRepo extends JpaRepository<UserBean, Long> {
}
