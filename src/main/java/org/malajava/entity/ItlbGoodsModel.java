/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;

/** 
 * ClassName: ItlbGoodsModel <br/> 
 * Function: TODO 商品信息<br/> 
 * date: 2017年2月23日 上午8:47:01 <br/> 
 * 
 * @author ld 
 * @version  
 * @since JDK 1.8 
 */
public class ItlbGoodsModel implements Serializable{

	 private  Integer id;
	 private  Integer dep_id;
	 private  Integer shop_id;
	 private  String good_name;
	 private  String is_show;
	 private  Double orders_weight;
	 private  Double price;
	 private  String remark;
	 private  String detail;
	 private  Integer status_line;
	 private  Integer good_new;
	 private  String logic_category;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the dep_id
	 */
	public Integer getDep_id() {
		return dep_id;
	}
	/**
	 * @param dep_id the dep_id to set
	 */
	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}
	/**
	 * @return the shop_id
	 */
	public Integer getShop_id() {
		return shop_id;
	}
	/**
	 * @param shop_id the shop_id to set
	 */
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	/**
	 * @return the good_name
	 */
	public String getGood_name() {
		return good_name;
	}
	/**
	 * @param good_name the good_name to set
	 */
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	/**
	 * @return the is_show
	 */
	public String getIs_show() {
		return is_show;
	}
	/**
	 * @param is_show the is_show to set
	 */
	public void setIs_show(String is_show) {
		this.is_show = is_show;
	}
	/**
	 * @return the orders_weight
	 */
	public Double getOrders_weight() {
		return orders_weight;
	}
	/**
	 * @param orders_weight the orders_weight to set
	 */
	public void setOrders_weight(Double orders_weight) {
		this.orders_weight = orders_weight;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * @return the status_line
	 */
	public Integer getStatus_line() {
		return status_line;
	}
	/**
	 * @param status_line the status_line to set
	 */
	public void setStatus_line(Integer status_line) {
		this.status_line = status_line;
	}
	/**
	 * @return the good_new
	 */
	public Integer getGood_new() {
		return good_new;
	}
	/**
	 * @param good_new the good_new to set
	 */
	public void setGood_new(Integer good_new) {
		this.good_new = good_new;
	}
	/**
	 * @return the logic_category
	 */
	public String getLogic_category() {
		return logic_category;
	}
	/**
	 * @param logic_category the logic_category to set
	 */
	public void setLogic_category(String logic_category) {
		this.logic_category = logic_category;
	}
	 
}
