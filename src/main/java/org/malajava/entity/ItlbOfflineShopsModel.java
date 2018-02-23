/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import org.malajava.entity.enums.ShopStatusEnum;

import java.io.Serializable;



/** 
 * ClassName: ItlbOfflineShopsModel <br/> 
 * Function: 门店实体 <br/> 
 * date: 2017年2月18日 上午9:15:36 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8 
 */
public class ItlbOfflineShopsModel   implements Serializable{
	private int id;
	private int stohouse_id;
	private int  area_id;
	private String  shop_address;
	private String  img_path;
	private String  tel_phone;
	private String  link_name;
	private String  link_phone;
	private String  remarks;
	private ShopStatusEnum status_line;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStohouse_id() {
		return stohouse_id;
	}

	public void setStohouse_id(int stohouse_id) {
		this.stohouse_id = stohouse_id;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public String getTel_phone() {
		return tel_phone;
	}

	public void setTel_phone(String tel_phone) {
		this.tel_phone = tel_phone;
	}

	public String getLink_name() {
		return link_name;
	}

	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}

	public String getLink_phone() {
		return link_phone;
	}

	public void setLink_phone(String link_phone) {
		this.link_phone = link_phone;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ShopStatusEnum getStatus_line() {
		return status_line;
	}

	public void setStatus_line(ShopStatusEnum status_line) {
		this.status_line = status_line;
	}
	
	
	
	

}
