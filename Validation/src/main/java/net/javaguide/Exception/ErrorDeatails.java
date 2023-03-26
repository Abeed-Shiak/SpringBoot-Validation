package net.javaguide.Exception;

import java.util.Date;

public class ErrorDeatails {
	private Date timestamp;
	private String meassage;
	private String Deatails;
	public ErrorDeatails(Date timestamp, String meassage, String deatails) {
		super();
		this.timestamp = timestamp;
		this.meassage = meassage;
		Deatails = deatails;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMeassage() {
		return meassage;
	}
	public void setMeassage(String meassage) {
		this.meassage = meassage;
	}
	public String getDeatails() {
		return Deatails;
	}
	public void setDeatails(String deatails) {
		Deatails = deatails;
	}
	
	
	

}
