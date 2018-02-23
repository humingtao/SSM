/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 1.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

/** 
 * ClassName: OrderDetailModel <br/> 
 * Function: TODO 功能描述 <br/> 
 * date: 2017年3月1日 上午9:45:32 <br/> 
 * 
 * @author Mr.W 
 * @version  
 * @since JDK 1.8 
 */
public class OrderDetailModel {
	private  int id;
	 private  String order_id;
	 private  int good_id;
	 private  String good_name;
	 private  String good_cover_img;
	 private  Double sale_price;
	 private  Double real_sale_price;
	 private  int buy_count;
	 private  int send_count;
	 private  int schedule_id;
	 private  int dept_id;
	 private  Double good_score;
	 private  String good_comment;
	 private  String minus_count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getGood_id() {
		return good_id;
	}
	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getGood_cover_img() {
		return good_cover_img;
	}
	public void setGood_cover_img(String good_cover_img) {
		this.good_cover_img = good_cover_img;
	}
	public Double getSale_price() {
		return sale_price;
	}
	public void setSale_price(Double sale_price) {
		this.sale_price = sale_price;
	}
	public Double getReal_sale_price() {
		return real_sale_price;
	}
	public void setReal_sale_price(Double real_sale_price) {
		this.real_sale_price = real_sale_price;
	}
	public int getBuy_count() {
		return buy_count;
	}
	public void setBuy_count(int buy_count) {
		this.buy_count = buy_count;
	}
	public int getSend_count() {
		return send_count;
	}
	public void setSend_count(int send_count) {
		this.send_count = send_count;
	}
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public Double getGood_score() {
		return good_score;
	}
	public void setGood_score(Double good_score) {
		this.good_score = good_score;
	}
	public String getGood_comment() {
		return good_comment;
	}
	public void setGood_comment(String good_comment) {
		this.good_comment = good_comment;
	}
	public String getMinus_count() {
		return minus_count;
	}
	public void setMinus_count(String minus_count) {
		this.minus_count = minus_count;
	}
	 
	}
