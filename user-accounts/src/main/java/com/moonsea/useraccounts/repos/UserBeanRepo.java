package com.moonsea.useraccounts.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moonsea.useraccounts.bean.UserBean;

@Repository
public interface UserBeanRepo extends JpaRepository<UserBean, Long> {
}
