/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;


/** 
 * ClassName: ItlbAreasModel <br/> 
 * Function: 区域实体 <br/> 
 * date: 2017年2月18日 上午9:15:36 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8 
 */
public class ItlbAreasModel   implements Serializable{
	private int id;
	private String area_name;
	private String  area_pinyin_short;
	private String  remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getArea_pinyin_short() {
		return area_pinyin_short;
	}
	public void setArea_pinyin_short(String area_pinyin_short) {
		this.area_pinyin_short = area_pinyin_short;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
