package com.CMS.bean;

public class FeeStr {
	
	private String stream;
	private double fee;
	
	public FeeStr(String stream, double fee) {
		super();
		this.stream = stream;
		this.fee = fee;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString()
	{
		return stream+ " " +fee;
	}

}
