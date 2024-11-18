package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class UserDetails {
	
	private int userId;
	private String useName;
	private int phoneNO;
	private String city;
	public UserDetails() {
		super();
	}
	public UserDetails(int userId, String useName, int phoneNO, String city) {
		super();
		this.userId = userId;
		this.useName = useName;
		this.phoneNO = phoneNO;
		this.city = city;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the useName
	 */
	public String getUseName() {
		return useName;
	}
	/**
	 * @param useName the useName to set
	 */
	public void setUseName(String useName) {
		this.useName = useName;
	}
	/**
	 * @return the phoneNO
	 */
	public int getPhoneNO() {
		return phoneNO;
	}
	/**
	 * @param phoneNO the phoneNO to set
	 */
	public void setPhoneNO(int phoneNO) {
		this.phoneNO = phoneNO;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", useName=" + useName + ", phoneNO=" + phoneNO + ", city=" + city
				+ "]";
	}
	

}
