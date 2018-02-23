/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

/** 
 * ClassName: BaseDeptsModel <br/> 
 * Function: TODO 部门 <br/> 
 * date: 2017年2月23日 上午9:20:53 <br/> 
 * 
 * @author ld 
 * @version  
 * @since JDK 1.8 
 */
public class BaseDeptsModel {

	 private  Integer id;
	 private  String dept_name;
	 private  String dept_pinyin_short;
	 private  Integer parent_id;
	 private  String remarks;
	 private  Integer is_deleted;
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
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}
	/**
	 * @param dept_name the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	/**
	 * @return the dept_pinyin_short
	 */
	public String getDept_pinyin_short() {
		return dept_pinyin_short;
	}
	/**
	 * @param dept_pinyin_short the dept_pinyin_short to set
	 */
	public void setDept_pinyin_short(String dept_pinyin_short) {
		this.dept_pinyin_short = dept_pinyin_short;
	}
	/**
	 * @return the parent_id
	 */
	
	
	
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @return the parent_id
	 */
	public Integer getParent_id() {
		return parent_id;
	}
	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the is_deleted
	 */
	public Integer getIs_deleted() {
		return is_deleted;
	}
	/**
	 * @param is_deleted the is_deleted to set
	 */
	public void setIs_deleted(Integer is_deleted) {
		this.is_deleted = is_deleted;
	}
	 
	 
	 
}
