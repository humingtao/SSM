/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 1.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: SystemPermissionsModel <br/>
 * Function: 系统用户权限模型<br/>
 * date: 2017年2月28日 下午2:34:46 <br/>
 * 
 * @author sky
 * @version 1.0
 * @since JDK 1.8
 */
public class SystemPermissionsModel implements Serializable {
	private Long id;//编号
	private Long parentId;//父编号
	private String name;//栏目显示名字
	private Date createAt;//创建时间
	private boolean deleted;//是否已经删除
	private String digest;
	private Integer status;//状态 1 可用  0 没用 
	private Date updateAt;//修改时间
	private String actionMethod;//提交方式 get  post
	private String actionUrl;//url路径
	private String code;//排序
	private boolean deleteAble;//能否删除
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
	 * @return the parentId
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
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
	 * @return the digest
	 */
	public String getDigest() {
		return digest;
	}
	/**
	 * @param digest the digest to set
	 */
	public void setDigest(String digest) {
		this.digest = digest;
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
	 * @return the actionMethod
	 */
	public String getActionMethod() {
		return actionMethod;
	}
	/**
	 * @param actionMethod the actionMethod to set
	 */
	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}
	/**
	 * @return the actionUrl
	 */
	public String getActionUrl() {
		return actionUrl;
	}
	/**
	 * @param actionUrl the actionUrl to set
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	
}
