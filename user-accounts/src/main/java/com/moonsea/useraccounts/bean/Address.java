package com.moonsea.useraccounts.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class Address {
	@Id
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
}
