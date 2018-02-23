/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 1.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: SystemRolesModel <br/>
 * Function: 系统角色实体<br/>
 * date: 2017年2月27日 下午3:02:34 <br/>
 * 
 * @author sky
 * @version 1.0
 * @since JDK 1.8
 */
public class SystemRolesModel implements Serializable {
	private Long id;//角色编号
	private String name;//名字
	private Date createAt;//创建时间
	private boolean deleted;//是否已经删除
	private Integer status ;//状态信息
	private Date updateAt;//修改时间
	private boolean deleteAble;//能否被删除
	private String description;//描述信息
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}
	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}
	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the updateAt
	 */
	public Date getUpdateAt() {
		return updateAt;
	}
	/**
	 * @param updateAt the updateAt to set
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	/**
	 * @return the deleteAble
	 */
	public boolean isDeleteAble() {
		return deleteAble;
	}
	/**
	 * @param deleteAble the deleteAble to set
	 */
	public void setDeleteAble(boolean deleteAble) {
		this.deleteAble = deleteAble;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}