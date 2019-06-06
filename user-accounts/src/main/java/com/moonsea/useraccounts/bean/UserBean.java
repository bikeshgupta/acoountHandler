package com.moonsea.useraccounts.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class UserBean {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column
	private String fname;
	@Column
	private String mname;
	@Column
	private String lname;
	@Column
	private String username;
	@Column
	private String level;
	@Column
	private Boolean isActive;
	@Column
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
	private UserDetails userDeatils;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Address> address;
	
	
	public UserBean(String fname, String mname, String lname, String username, String level, Boolean isActive,
			String password) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.username = username;
		this.level = level;
		this.isActive = isActive;
		this.password = password;
	}
	
	public UserBean() {
		this.fname = "Fisrt";
		this.mname = "Middle";
		this.lname = "Last";
		this.username = "username";
		this.level = "L-0";
		this.isActive = true;
		this.password = "password";
	}
	
	
	
	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDetails getUserDeatils() {
		return userDeatils;
	}

	public void setUserDeatils(UserDetails userDeatils) {
		this.userDeatils = userDeatils;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
