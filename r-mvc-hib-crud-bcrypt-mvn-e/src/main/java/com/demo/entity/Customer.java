package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="code")
	private int code;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="customerAddress")
	private String customerAddress;
	
	@Column(name="customerPinCode")
	private String customerPinCode;
	
	@Column(name="customerEmail")
	private String customerEmail;
	
	@Column(name="contactNumber")
	private String contactNumber;
	
	@Column(name="registrationDate")
	private String registrationDate;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="modifiedDate")
	private String modifiedDate;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPinCode() {
		return customerPinCode;
	}

	public void setCustomerPinCode(String customerPinCode) {
		this.customerPinCode = customerPinCode;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", customerPinCode=" + customerPinCode + ", customerEmail=" + customerEmail + ", contactNumber="
				+ contactNumber + ", registrationDate=" + registrationDate + ", createdBy=" + createdBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}