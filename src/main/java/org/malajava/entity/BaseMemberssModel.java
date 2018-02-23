/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import org.malajava.entity.enums.DeptStatusEnum;
import org.malajava.entity.enums.SexEnum;

import java.io.Serializable;
import java.util.Date;



/** 
 * ClassName: BaseMemberssModel <br/> 
 * Function: 会员实体 <br/> 
 * date: 2017年2月18日 上午9:15:36 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8 
 */
public class BaseMemberssModel   implements Serializable{
	private int id;
	private String memberNumber;
	private String  memberPassword;
	private String  memberName;
	private Date  memberBirthday;
	private String  memberIdNumber;
	private String  memberZipCode;
	private String  memberPhone;
	private String  memberMobile;
	private String  memberEmail;
	private Float  memberRemainderPoints;
	private Float  memberOffsetPoints;
	private Double  memberCardExpenses;
	private Date  memberBeginDate;
	private Date  memberEndDate;
	private Date  memberLastUseDate;
	private Double  memberTotalSpending;
	private int  memberTotalTimes;
	private int  member_memCard_Id;
	private String  memberMemo;
	private String  memberSpare_1;
	private String  headerimg;
	private DeptStatusEnum memberState;
	private SexEnum memberSex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getMemberBirthday() {
		return memberBirthday;
	}
	public void setMemberBirthday(Date memberBirthday) {
		this.memberBirthday = memberBirthday;
	}
	public String getMemberIdNumber() {
		return memberIdNumber;
	}
	public void setMemberIdNumber(String memberIdNumber) {
		this.memberIdNumber = memberIdNumber;
	}
	public String getMemberZipCode() {
		return memberZipCode;
	}
	public void setMemberZipCode(String memberZipCode) {
		this.memberZipCode = memberZipCode;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberMobile() {
		return memberMobile;
	}
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Float getMemberRemainderPoints() {
		return memberRemainderPoints;
	}
	public void setMemberRemainderPoints(Float memberRemainderPoints) {
		this.memberRemainderPoints = memberRemainderPoints;
	}
	public Float getMemberOffsetPoints() {
		return memberOffsetPoints;
	}
	public void setMemberOffsetPoints(Float memberOffsetPoints) {
		this.memberOffsetPoints = memberOffsetPoints;
	}
	public Double getMemberCardExpenses() {
		return memberCardExpenses;
	}
	public void setMemberCardExpenses(Double memberCardExpenses) {
		this.memberCardExpenses = memberCardExpenses;
	}
	public Date getMemberBeginDate() {
		return memberBeginDate;
	}
	public void setMemberBeginDate(Date memberBeginDate) {
		this.memberBeginDate = memberBeginDate;
	}
	public Date getMemberEndDate() {
		return memberEndDate;
	}
	public void setMemberEndDate(Date memberEndDate) {
		this.memberEndDate = memberEndDate;
	}
	public Date getMemberLastUseDate() {
		return memberLastUseDate;
	}
	public void setMemberLastUseDate(Date memberLastUseDate) {
		this.memberLastUseDate = memberLastUseDate;
	}
	public Double getMemberTotalSpending() {
		return memberTotalSpending;
	}
	public void setMemberTotalSpending(Double memberTotalSpending) {
		this.memberTotalSpending = memberTotalSpending;
	}
	public int getMemberTotalTimes() {
		return memberTotalTimes;
	}
	public void setMemberTotalTimes(int memberTotalTimes) {
		this.memberTotalTimes = memberTotalTimes;
	}
	public int getMember_memCard_Id() {
		return member_memCard_Id;
	}
	public void setMember_memCard_Id(int member_memCard_Id) {
		this.member_memCard_Id = member_memCard_Id;
	}
	public String getMemberMemo() {
		return memberMemo;
	}
	public void setMemberMemo(String memberMemo) {
		this.memberMemo = memberMemo;
	}
	public String getMemberSpare_1() {
		return memberSpare_1;
	}
	public void setMemberSpare_1(String memberSpare_1) {
		this.memberSpare_1 = memberSpare_1;
	}
	public String getHeaderimg() {
		return headerimg;
	}
	public void setHeaderimg(String headerimg) {
		this.headerimg = headerimg;
	}
	public DeptStatusEnum getMemberState() {
		return memberState;
	}
	public void setMemberState(DeptStatusEnum memberState) {
		this.memberState = memberState;
	}
	public SexEnum getMemberSex() {
		return memberSex;
	}
	public void setMemberSex(SexEnum memberSex) {
		this.memberSex = memberSex;
	}
	
	
	
	

}
