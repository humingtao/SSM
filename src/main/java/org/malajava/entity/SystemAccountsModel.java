/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 1.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: SystemAccountsModel <br/>
 * Function: 系统账户实体<br/>
 * date: 2017年2月24日 下午1:00:26 <br/>
 * 
 * @author sky
 * @version 1.0
 * @since JDK 1.8
 */
public class SystemAccountsModel implements Serializable {
	
	private Integer Id; 		// 账户编号
	private Boolean deleted;	// 逻辑删除
	private Integer status;		// 用户状态 0 无用 1可用
	private Date createAt;		// 创建时间
	private Date updateAt;		// 更新时间
	private String account;		//账户
	private String headPic;		//头像
	private Date lastLoginAt;	//最后登录时间
	private Boolean locked;		//是否锁定
	private String passwordDigist;//加密后的密码
	private String realName;	//真实姓名
	private String salt;		// '盐值'

	//一个账户中有多个角色
	private List<SystemRolesModel> systemRoles=new ArrayList<SystemRolesModel>(0);
	
	
	/**
	 * @return the systemRoles
	 */
	public List<SystemRolesModel> getSystemRoles() {
		return systemRoles;
	}

	/**
	 * @param systemRoles the systemRoles to set
	 */
	public void setSystemRoles(List<SystemRolesModel> systemRoles) {
		this.systemRoles = systemRoles;
	}

	public Integer getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}

	/**
	 * @return the deleted
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * @param deleted
	 *            the deleted to set
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt
	 *            the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the updateAt
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * @param updateAt
	 *            the updateAt to set
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the headPic
	 */
	public String getHeadPic() {
		return headPic;
	}

	/**
	 * @param headPic
	 *            the headPic to set
	 */
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	/**
	 * @return the lastLoginAt
	 */
	public Date getLastLoginAt() {
		return lastLoginAt;
	}

	/**
	 * @param lastLoginAt
	 *            the lastLoginAt to set
	 */
	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	/**
	 * @return the locked
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * @param locked
	 *            the locked to set
	 */
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	/**
	 * @return the passwordDigist
	 */
	public String getPasswordDigist() {
		return passwordDigist;
	}

	/**
	 * @param passwordDigist
	 *            the passwordDigist to set
	 */
	public void setPasswordDigist(String passwordDigist) {
		this.passwordDigist = passwordDigist;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName
	 *            the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

}
