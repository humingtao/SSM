/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import org.malajava.entity.enums.DeptStatusEnum;

import java.io.Serializable;


/** 
 * ClassName: BaseDeptssModel <br/> 
 * Function: 部门实体 <br/> 
 * date: 2017年2月18日 上午9:15:36 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8 
 */
public class BaseDeptssModel   implements Serializable{
	private int id;
	private String dept_name;
	private String  dept_pinyin_short;
	private int  parent_id;
	private String  remarks;
	private DeptStatusEnum is_deleted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_pinyin_short() {
		return dept_pinyin_short;
	}
	public void setDept_pinyin_short(String dept_pinyin_short) {
		this.dept_pinyin_short = dept_pinyin_short;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public DeptStatusEnum getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(DeptStatusEnum is_deleted) {
		this.is_deleted = is_deleted;
	}
	
	

}
