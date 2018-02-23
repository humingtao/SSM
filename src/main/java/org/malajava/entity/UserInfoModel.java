package org.malajava.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfoModel implements Serializable {
	private int id;
	private String username;
	private String userpass;
	private int age;
	private String gender;
	private String hobby;
	private String province;
	private Date birthday;
	private Date reg_date;
	private String imgurl;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return this.gender==null ? "": this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		if(hobby != null)
		return hobby;
		else return "";
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getProvince() {
		if(province != null)
		return province;
		else return "";
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
}
