package com.hithaui.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UserDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userID;
	
	@Column(name = "userName",nullable = false,unique = true)
	private String userName;
	
	@Column(name = "passWord")
	private String passWord;
	
	@Column(name = "money",nullable = false)
	private Integer money;
	
	@Column(name = "email",nullable = false,unique = true)
	private String email;
	
	@Column(name = "phoneNumber",nullable = false,unique = true)
	private String phoneNumber ;
	
	@Column(name = "linkImage",nullable = false)
	private String linkImage;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public UserDAO(Integer userID, String userName, String passWord, Integer money, String email, String phoneNumber,
			String linkImage) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.passWord = passWord;
		this.money = money;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.linkImage = linkImage;
	}

	public UserDAO() {
		super();
	}
	
}
