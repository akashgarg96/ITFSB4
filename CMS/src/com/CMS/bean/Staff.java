package com.CMS.bean;

public class Staff {
	
	private int staffId;
	private String staffName;
	private double salary;
	private String staffUsername;
	private String staffPassword;
	private String deptName;
	
	
	
	public Staff(String staffUsername, String staffPassword) {
		super();
		this.staffUsername = staffUsername;
		this.staffPassword = staffPassword;
	}


	public Staff(int staffId, String staffName, double salary, String staffUsername, String staffPassword,
			String deptName) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.salary = salary;
		this.staffUsername = staffUsername;
		this.staffPassword = staffPassword;
		this.deptName = deptName;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getStaffUsername() {
		return staffUsername;
	}


	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}


	public String getStaffPassword() {
		return staffPassword;
	}


	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String toString()
	{
		return staffId+ " " +staffName+ " "+ " " +salary+ " " +staffUsername+ " " +staffPassword +" "+deptName;
	}
	

}
