/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;

/** 
 * ClassName: BaseMembersModel <br/> 
 * Function: TODO 成员实体 <br/> 
 * date: 2017年2月21日 下午8:38:26 <br/> 
 * 
 * @author Administrator 
 * @version  
 * @since JDK 1.8 
 */
public class BaseMembersModel implements Serializable {
	 private  Integer Id;
	 private  String memberNumber;
	 private  String memberPassword;
	 private  String memberName;
	 private  Integer memberSex;
	 private  String memberBirthday;
	 private  String memberIdNumber;
	 private  String memberZipCode;
	 private  String memberPhone;
	 private  String memberMobile;
	 private  String memberEmail;
	 private  Float memberRemainderPoints;
	 private  Float memberOffsetPoints;
	 private  Double memberCardExpenses;
	 private  String memberBeginDate;
	 private  String memberEndDate;
	 private  String memberLastUseDate;
	 private  Integer memberState;
	 private  Double memberTotalSpending;
	 private  Integer memberTotalTimes;
	 private  Long member_memCard_Id;
	 private  String memberMemo;
	 private  String memberSpare_1;
	 private  String headerimg;
	 
	 
	 /**
	 * @param headerimg the headerimg to set
	 */
	public void setHeaderimg(String headerimg) {
		this.headerimg = headerimg;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}
	/**
	 * @return the memberNumber
	 */
	public String getMemberNumber() {
		return memberNumber;
	}
	/**
	 * @param memberNumber the memberNumber to set
	 */
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	/**
	 * @return the memberPassword
	 */
	public String getMemberPassword() {
		return memberPassword;
	}
	/**
	 * @param memberPassword the memberPassword to set
	 */
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * @return the memberSex
	 */
	public Integer getMemberSex() {
		return memberSex;
	}
	/**
	 * @param memberSex the memberSex to set
	 */
	public void setMemberSex(Integer memberSex) {
		this.memberSex = memberSex;
	}
	/**
	 * @return the memberBirthday
	 */
	public String getMemberBirthday() {
		return memberBirthday;
	}
	/**
	 * @param memberBirthday the memberBirthday to set
	 */
	public void setMemberBirthday(String memberBirthday) {
		this.memberBirthday = memberBirthday;
	}
	/**
	 * @return the memberIdNumber
	 */
	public String getMemberIdNumber() {
		return memberIdNumber;
	}
	/**
	 * @param memberIdNumber the memberIdNumber to set
	 */
	public void setMemberIdNumber(String memberIdNumber) {
		this.memberIdNumber = memberIdNumber;
	}
	/**
	 * @return the memberZipCode
	 */
	public String getMemberZipCode() {
		return memberZipCode;
	}
	/**
	 * @param memberZipCode the memberZipCode to set
	 */
	public void setMemberZipCode(String memberZipCode) {
		this.memberZipCode = memberZipCode;
	}
	/**
	 * @return the memberPhone
	 */
	public String getMemberPhone() {
		return memberPhone;
	}
	/**
	 * @param memberPhone the memberPhone to set
	 */
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	/**
	 * @return the memberMobile
	 */
	public String getMemberMobile() {
		return memberMobile;
	}
	/**
	 * @param memberMobile the memberMobile to set
	 */
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	/**
	 * @return the memberEmail
	 */
	public String getMemberEmail() {
		return memberEmail;
	}
	/**
	 * @param memberEmail the memberEmail to set
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	/**
	 * @return the memberRemainderPoints
	 */
	public Float getMemberRemainderPoints() {
		return memberRemainderPoints;
	}
	/**
	 * @param memberRemainderPoints the memberRemainderPoints to set
	 */
	public void setMemberRemainderPoints(Float memberRemainderPoints) {
		this.memberRemainderPoints = memberRemainderPoints;
	}
	/**
	 * @return the memberOffsetPoints
	 */
	public Float getMemberOffsetPoints() {
		return memberOffsetPoints;
	}
	/**
	 * @param memberOffsetPoints the memberOffsetPoints to set
	 */
	public void setMemberOffsetPoints(Float memberOffsetPoints) {
		this.memberOffsetPoints = memberOffsetPoints;
	}
	/**
	 * @return the memberCardExpenses
	 */
	public Double getMemberCardExpenses() {
		return memberCardExpenses;
	}
	/**
	 * @param memberCardExpenses the memberCardExpenses to set
	 */
	public void setMemberCardExpenses(Double memberCardExpenses) {
		this.memberCardExpenses = memberCardExpenses;
	}
	/**
	 * @return the memberBeginDate
	 */
	public String getMemberBeginDate() {
		return memberBeginDate;
	}
	/**
	 * @param memberBeginDate the memberBeginDate to set
	 */
	public void setMemberBeginDate(String memberBeginDate) {
		this.memberBeginDate = memberBeginDate;
	}
	/**
	 * @return the memberEndDate
	 */
	public String getMemberEndDate() {
		return memberEndDate;
	}
	/**
	 * @param memberEndDate the memberEndDate to set
	 */
	public void setMemberEndDate(String memberEndDate) {
		this.memberEndDate = memberEndDate;
	}
	/**
	 * @return the memberLastUseDate
	 */
	public String getMemberLastUseDate() {
		return memberLastUseDate;
	}
	/**
	 * @param memberLastUseDate the memberLastUseDate to set
	 */
	public void setMemberLastUseDate(String memberLastUseDate) {
		this.memberLastUseDate = memberLastUseDate;
	}
	/**
	 * @return the memberState
	 */
	public Integer getMemberState() {
		return memberState;
	}
	/**
	 * @param memberState the memberState to set
	 */
	public void setMemberState(Integer memberState) {
		this.memberState = memberState;
	}
	/**
	 * @return the memberTotalSpending
	 */
	public Double getMemberTotalSpending() {
		return memberTotalSpending;
	}
	/**
	 * @param memberTotalSpending the memberTotalSpending to set
	 */
	public void setMemberTotalSpending(Double memberTotalSpending) {
		this.memberTotalSpending = memberTotalSpending;
	}
	/**
	 * @return the memberTotalTimes
	 */
	public Integer getMemberTotalTimes() {
		return memberTotalTimes;
	}
	/**
	 * @param memberTotalTimes the memberTotalTimes to set
	 */
	public void setMemberTotalTimes(Integer memberTotalTimes) {
		this.memberTotalTimes = memberTotalTimes;
	}
	/**
	 * @return the member_memCard_Id
	 */
	public Long getMember_memCard_Id() {
		return member_memCard_Id;
	}
	/**
	 * @param member_memCard_Id the member_memCard_Id to set
	 */
	public void setMember_memCard_Id(Long member_memCard_Id) {
		this.member_memCard_Id = member_memCard_Id;
	}
	/**
	 * @return the memberMemo
	 */
	public String getMemberMemo() {
		return memberMemo;
	}
	/**
	 * @param memberMemo the memberMemo to set
	 */
	public void setMemberMemo(String memberMemo) {
		this.memberMemo = memberMemo;
	}
	/**
	 * @return the memberSpare_1
	 */
	public String getMemberSpare_1() {
		return memberSpare_1;
	}
	/**
	 * @param memberSpare_1 the memberSpare_1 to set
	 */
	public void setMemberSpare_1(String memberSpare_1) {
		this.memberSpare_1 = memberSpare_1;
	}
	/**
	 * @return the headerimg
	 */
	public String getHeaderimg() {
		return headerimg;
	}
	/**
	 * @param headerimg the headerimg to set
	 */

}
