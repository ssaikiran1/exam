package com.insurence.healthinsurence.modals;

import java.util.Date;

public class Users {
	private int user_id;
	private String user_name;
	private Date user_cdate;
	private String user_pwd;
	private String user_type;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getUser_cdate() {
		return user_cdate;
	}

	public void setUser_cdate(Date user_cdate) {
		this.user_cdate = user_cdate;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	private String user_status;

}
