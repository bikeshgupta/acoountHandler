package com.moonsea.useraccounts.repos;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moonsea.useraccounts.bean.UserBean;

@Repository
public interface UserBeanRepo extends JpaRepository<UserBean, Long> {

	List<UserBean> findByUsernameIn(List<String> users);
}
