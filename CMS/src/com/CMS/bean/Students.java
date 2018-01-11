package com.CMS.bean;

import java.util.Date;

public class Students {
	
	private int sId;
	private String sName;
	private String gender;
	private Date dob;
	private String stream;
	private String email;
	private long contact;
	private String username;
	private String password;
	
	public Students(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Students(int sId, String sName, String gender, Date dob, String stream, String email,
			long contact, String username, String password) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.gender = gender;
		this.dob = dob;
		this.stream = stream;
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
	}


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}



	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return sId+ " " +sName+ " " +gender+ " " +dob+ " " +stream+ " " +email+ " " +contact+ "  " +username+ " " +password;
	}
	
	

}
