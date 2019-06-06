package com.moonsea.useraccounts.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String hno;
	@Column
	private String street;
	@Column
	private String postoffice;
	@Column
	private String city;
	@Column
	private String district;
	@Column
	private String state;
	@Column
	private Long pincode;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserBean user;
	
	
	
	
	public Address() {
	}
	
	
	public Address(String hno, String street, String postoffice, String city, String district, String state,
			Long pincode) {
		super();
		this.hno = hno;
		this.street = street;
		this.postoffice = postoffice;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		//this.users = users;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}


	public UserBean getUser() {
		return user;
	}


	public void setUser(UserBean user) {
		this.user = user;
	}
	
	
	
}
