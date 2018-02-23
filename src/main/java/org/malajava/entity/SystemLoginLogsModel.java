/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 1.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: SystemLoginLogsModel <br/>
 * Function: 登录日志记录<br/>
 * date: 2017年2月24日 下午6:29:54 <br/>
 * 
 * @author sky
 * @version 1.0
 * @since JDK 1.8
 */
public class SystemLoginLogsModel implements Serializable {
	private Integer id;// 编号
	private Date createAt;// '创建时间',
	private Boolean deleted; // '是否删除',
	private Date updateAt;// '更新时间',
	private Long loginAccount;// '登录次数',
	private String loginName;// 登录名称,
	private Date loginTime; // 登录时间,
	private String loginIp; // 客户端ip,
	private boolean loginResult; // '登录结果',
	private String loginResultDesc;// '登录结果描述',
	
	/**
	 * @return the loginAccount
	 */
	public Long getLoginAccount() {
		return loginAccount;
	}
	/**
	 * @param loginAccount the loginAccount to set
	 */
	public void setLoginAccount(Long loginAccount) {
		this.loginAccount = loginAccount;
	}
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
	 * @return the loginResult
	 */
	public boolean isLoginResult() {
		return loginResult;
	}
	/**
	 * @param loginResult the loginResult to set
	 */
	public void setLoginResult(boolean loginResult) {
		this.loginResult = loginResult;
	}
	/**
	 * @return the deleted
	 */
	public Boolean getDeleted() {
		return deleted;
	}
	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
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
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * @return the loginIp
	 */
	public String getLoginIp() {
		return loginIp;
	}
	/**
	 * @param loginIp the loginIp to set
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	/**
	 * @return the loginResultDesc
	 */
	public String getLoginResultDesc() {
		return loginResultDesc;
	}
	/**
	 * @param loginResultDesc the loginResultDesc to set
	 */
	public void setLoginResultDesc(String loginResultDesc) {
		this.loginResultDesc = loginResultDesc;
	}
}	
