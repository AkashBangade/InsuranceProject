package com.mpha.SpringBootExample.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Custmer_deatails")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Long id;
	
	@Column(name = "username")
	@NotBlank(message = "Name is Mandetory")
	private String userName;
	
	@Column
	private String userAddress;
	
	@Column
	private String emailAddress;
	
	@Column
	@NotBlank(message = "Contact number is Mandetory")
	private String contact;
	
	@Column
	private Date DOB;
	
	@Column
	private String bloodGroup;
	
	@Column
	private String mark;
	
	@Column
	private int height;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", userAddress=" + userAddress + ", emailAddress="
				+ emailAddress + ", contact=" + contact + ", DOB=" + DOB + ", bloodGroup=" + bloodGroup + ", mark="
				+ mark + ", height=" + height + "]";
	}

	public Customer(Long id, @NotBlank(message = "Name is Mandetory") String userName, String userAddress,
			String emailAddress, @NotBlank(message = "Contact number is Mandetory") String contact, Date dOB,
			String bloodGroup, String mark, int height) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAddress = userAddress;
		this.emailAddress = emailAddress;
		this.contact = contact;
		DOB = dOB;
		this.bloodGroup = bloodGroup;
		this.mark = mark;
		this.height = height;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
