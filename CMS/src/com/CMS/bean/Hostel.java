package com.CMS.bean;

public class Hostel {
	
	private int roomNo;
	private String seaterType;
	private String roomType;
	
	public Hostel(int roomNo, String seaterType, String roomType) {
		super();
		this.roomNo = roomNo;
		this.seaterType = seaterType;
		this.roomType = roomType;
	}


	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public String getSeaterType() {
		return seaterType;
	}


	public void setSeaterType(String seaterType) {
		this.seaterType = seaterType;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String toString()
	{
		return roomNo+ " " +seaterType+ " " +roomType;
	}

}
