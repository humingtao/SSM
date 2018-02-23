/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import org.malajava.entity.enums.YesNoEnum;

import java.io.Serializable;


/** 
 * ClassName: ItlbAcceptAddresssModel <br/> 
 * Function: 收货地址实体 <br/> 
 * date: 2017年2月18日 上午9:15:36 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8 
 */
public class ItlbAcceptAddresssModel   implements Serializable{
	private int id;
	private int member_id;
	private String  province;
	private String  city;
	private String  area;
	private String  accept_name;
	private String  accept_phone;
	private String  accept_address;
	private String  post_code;

	private YesNoEnum is_default;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAccept_name() {
		return accept_name;
	}

	public void setAccept_name(String accept_name) {
		this.accept_name = accept_name;
	}

	public String getAccept_phone() {
		return accept_phone;
	}

	public void setAccept_phone(String accept_phone) {
		this.accept_phone = accept_phone;
	}

	public String getAccept_address() {
		return accept_address;
	}

	public void setAccept_address(String accept_address) {
		this.accept_address = accept_address;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public YesNoEnum getIs_default() {
		return is_default;
	}

	public void setIs_default(YesNoEnum is_default) {
		this.is_default = is_default;
	}
	
	
	

}
