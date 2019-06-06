package com.moonsea.useraccounts.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="userdtls")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String mobile1;
	@Column
	private String mobile2;
	
	@Column
	private String idProof;
	@Column
	private String idProofNumber;
	@Column
	private String degisnation;
	@Column
	private Long reportingTo;
	@Column
	private Date createdDate;
	@Column
	private String createdBy;
	@Column
	private Date modifiedDate;
	@Column
	private String modifiedBy;
	
	 @JsonIgnore
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "user_id", nullable = false)
	 private UserBean user;
	 
	 
	
	public UserBean getUser() {
		return user;
	}



	public void setUser(UserBean user) {
		this.user = user;
	}



	public UserDetails() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public UserDetails(String mobile1, String mobile2, String idProof, String idProofNumber,
			String degisnation, Long reportingTo) {
		super();
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.idProof = idProof;
		this.idProofNumber = idProofNumber;
		this.degisnation = degisnation;
		this.reportingTo = reportingTo;
		createdBy="SYSTEM";
		createdDate= new Date();
	}
	

	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getIdProofNumber() {
		return idProofNumber;
	}
	public void setIdProofNumber(String idProofNumber) {
		this.idProofNumber = idProofNumber;
	}
	public String getDegisnation() {
		return degisnation;
	}
	public void setDegisnation(String degisnation) {
		this.degisnation = degisnation;
	}
	public Long getReportingTo() {
		return reportingTo;
	}
	public void setReportingTo(Long reportingTo) {
		this.reportingTo = reportingTo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
	
}
