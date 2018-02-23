/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;

/** 
 * ClassName: BaseGoodsModel <br/> 
 * Function: TODO 商品实体描述 <br/> 
 * date: 2017年2月21日 下午9:10:09 <br/> 
 * 
 * @author ld 
 * @version  
 * @since JDK 1.8 
 */
public class BaseGoodsModel implements Serializable{
	 private  Integer goodsId;
	 private  String goodsNumber;
	 private  String goodsBarNo;
	 private  String goodsName;
	 private  String goodsForShort;
	 private  String goodsPinYin;
	 private  Double goodsPurchasePrice;
	 private  Double goodsSellingPrice;
	 private  Double goodsMemberPrice;
	 private  String goodsPlaceOfOrigin;
	 private  String goodsSpecification;
	 private  String goodsGrade;
	 private  Integer goods_pUnit_Id;
	 private  Float goodsInputTax;
	 private  Float goodsOutputTax;
	 private  Integer goods_Brand_Id;
	 private  Integer goods_GosCte_Id;
	 private  Integer goods_Provider_Id;
	 private  Integer goodsIsNew;
	 private  Integer goodsAllowAccumulatePoints;
	 private  Integer goodsAllowDiscount;
	 private  Integer goodsAllowMemberPrice;
	 private  Integer goodsState;
	 private  String goodsMemo;
	 private  String brandName;
	 private  String goodsCteNumber;
	 private  String goodsCteName;
	 private  String providerNumber;
	 private  String providerName;
	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the goodsNumber
	 */
	public String getGoodsNumber() {
		return goodsNumber;
	}
	/**
	 * @param goodsNumber the goodsNumber to set
	 */
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	/**
	 * @return the goodsBarNo
	 */
	public String getGoodsBarNo() {
		return goodsBarNo;
	}
	/**
	 * @param goodsBarNo the goodsBarNo to set
	 */
	public void setGoodsBarNo(String goodsBarNo) {
		this.goodsBarNo = goodsBarNo;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsForShort
	 */
	public String getGoodsForShort() {
		return goodsForShort;
	}
	/**
	 * @param goodsForShort the goodsForShort to set
	 */
	public void setGoodsForShort(String goodsForShort) {
		this.goodsForShort = goodsForShort;
	}
	/**
	 * @return the goodsPinYin
	 */
	public String getGoodsPinYin() {
		return goodsPinYin;
	}
	/**
	 * @param goodsPinYin the goodsPinYin to set
	 */
	public void setGoodsPinYin(String goodsPinYin) {
		this.goodsPinYin = goodsPinYin;
	}
	/**
	 * @return the goodsPurchasePrice
	 */
	public Double getGoodsPurchasePrice() {
		return goodsPurchasePrice;
	}
	/**
	 * @param goodsPurchasePrice the goodsPurchasePrice to set
	 */
	public void setGoodsPurchasePrice(Double goodsPurchasePrice) {
		this.goodsPurchasePrice = goodsPurchasePrice;
	}
	/**
	 * @return the goodsSellingPrice
	 */
	public Double getGoodsSellingPrice() {
		return goodsSellingPrice;
	}
	/**
	 * @param goodsSellingPrice the goodsSellingPrice to set
	 */
	public void setGoodsSellingPrice(Double goodsSellingPrice) {
		this.goodsSellingPrice = goodsSellingPrice;
	}
	/**
	 * @return the goodsMemberPrice
	 */
	public Double getGoodsMemberPrice() {
		return goodsMemberPrice;
	}
	/**
	 * @param goodsMemberPrice the goodsMemberPrice to set
	 */
	public void setGoodsMemberPrice(Double goodsMemberPrice) {
		this.goodsMemberPrice = goodsMemberPrice;
	}
	/**
	 * @return the goodsPlaceOfOrigin
	 */
	public String getGoodsPlaceOfOrigin() {
		return goodsPlaceOfOrigin;
	}
	/**
	 * @param goodsPlaceOfOrigin the goodsPlaceOfOrigin to set
	 */
	public void setGoodsPlaceOfOrigin(String goodsPlaceOfOrigin) {
		this.goodsPlaceOfOrigin = goodsPlaceOfOrigin;
	}
	/**
	 * @return the goodsSpecification
	 */
	public String getGoodsSpecification() {
		return goodsSpecification;
	}
	/**
	 * @param goodsSpecification the goodsSpecification to set
	 */
	public void setGoodsSpecification(String goodsSpecification) {
		this.goodsSpecification = goodsSpecification;
	}
	/**
	 * @return the goodsGrade
	 */
	public String getGoodsGrade() {
		return goodsGrade;
	}
	/**
	 * @param goodsGrade the goodsGrade to set
	 */
	public void setGoodsGrade(String goodsGrade) {
		this.goodsGrade = goodsGrade;
	}
	
	/**
	 * @return the goodsInputTax
	 */
	public Float getGoodsInputTax() {
		return goodsInputTax;
	}
	/**
	 * @param goodsInputTax the goodsInputTax to set
	 */
	public void setGoodsInputTax(Float goodsInputTax) {
		this.goodsInputTax = goodsInputTax;
	}
	/**
	 * @return the goodsOutputTax
	 */
	public Float getGoodsOutputTax() {
		return goodsOutputTax;
	}
	/**
	 * @param goodsOutputTax the goodsOutputTax to set
	 */
	public void setGoodsOutputTax(Float goodsOutputTax) {
		this.goodsOutputTax = goodsOutputTax;
	}
	/**
	 * @return the goods_Brand_Id
	 */
	
	/**
	 * @return the goodsMemo
	 */
	public String getGoodsMemo() {
		return goodsMemo;
	}
	/**
	 * @param goodsMemo the goodsMemo to set
	 */
	public void setGoodsMemo(String goodsMemo) {
		this.goodsMemo = goodsMemo;
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	/**
	 * @return the goodsCteNumber
	 */
	public String getGoodsCteNumber() {
		return goodsCteNumber;
	}
	/**
	 * @param goodsCteNumber the goodsCteNumber to set
	 */
	public void setGoodsCteNumber(String goodsCteNumber) {
		this.goodsCteNumber = goodsCteNumber;
	}
	/**
	 * @return the goodsCteName
	 */
	public String getGoodsCteName() {
		return goodsCteName;
	}
	/**
	 * @param goodsCteName the goodsCteName to set
	 */
	public void setGoodsCteName(String goodsCteName) {
		this.goodsCteName = goodsCteName;
	}
	/**
	 * @return the providerNumber
	 */
	public String getProviderNumber() {
		return providerNumber;
	}
	/**
	 * @param providerNumber the providerNumber to set
	 */
	public void setProviderNumber(String providerNumber) {
		this.providerNumber = providerNumber;
	}
	/**
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}
	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	/**
	 * @return the goods_pUnit_Id
	 */
	public Integer getGoods_pUnit_Id() {
		return goods_pUnit_Id;
	}
	/**
	 * @param goods_pUnit_Id the goods_pUnit_Id to set
	 */
	public void setGoods_pUnit_Id(Integer goods_pUnit_Id) {
		this.goods_pUnit_Id = goods_pUnit_Id;
	}
	/**
	 * @return the goods_Brand_Id
	 */
	public Integer getGoods_Brand_Id() {
		return goods_Brand_Id;
	}
	/**
	 * @param goods_Brand_Id the goods_Brand_Id to set
	 */
	public void setGoods_Brand_Id(Integer goods_Brand_Id) {
		this.goods_Brand_Id = goods_Brand_Id;
	}
	/**
	 * @return the goods_GosCte_Id
	 */
	public Integer getGoods_GosCte_Id() {
		return goods_GosCte_Id;
	}
	/**
	 * @param goods_GosCte_Id the goods_GosCte_Id to set
	 */
	public void setGoods_GosCte_Id(Integer goods_GosCte_Id) {
		this.goods_GosCte_Id = goods_GosCte_Id;
	}
	/**
	 * @return the goods_Provider_Id
	 */
	public Integer getGoods_Provider_Id() {
		return goods_Provider_Id;
	}
	/**
	 * @param goods_Provider_Id the goods_Provider_Id to set
	 */
	public void setGoods_Provider_Id(Integer goods_Provider_Id) {
		this.goods_Provider_Id = goods_Provider_Id;
	}
	/**
	 * @return the goodsIsNew
	 */
	public Integer getGoodsIsNew() {
		return goodsIsNew;
	}
	/**
	 * @param goodsIsNew the goodsIsNew to set
	 */
	public void setGoodsIsNew(Integer goodsIsNew) {
		this.goodsIsNew = goodsIsNew;
	}
	/**
	 * @return the goodsAllowAccumulatePoints
	 */
	public Integer getGoodsAllowAccumulatePoints() {
		return goodsAllowAccumulatePoints;
	}
	/**
	 * @param goodsAllowAccumulatePoints the goodsAllowAccumulatePoints to set
	 */
	public void setGoodsAllowAccumulatePoints(Integer goodsAllowAccumulatePoints) {
		this.goodsAllowAccumulatePoints = goodsAllowAccumulatePoints;
	}
	/**
	 * @return the goodsAllowDiscount
	 */
	public Integer getGoodsAllowDiscount() {
		return goodsAllowDiscount;
	}
	/**
	 * @param goodsAllowDiscount the goodsAllowDiscount to set
	 */
	public void setGoodsAllowDiscount(Integer goodsAllowDiscount) {
		this.goodsAllowDiscount = goodsAllowDiscount;
	}
	/**
	 * @return the goodsAllowMemberPrice
	 */
	public Integer getGoodsAllowMemberPrice() {
		return goodsAllowMemberPrice;
	}
	/**
	 * @param goodsAllowMemberPrice the goodsAllowMemberPrice to set
	 */
	public void setGoodsAllowMemberPrice(Integer goodsAllowMemberPrice) {
		this.goodsAllowMemberPrice = goodsAllowMemberPrice;
	}
	/**
	 * @return the goodsState
	 */
	public Integer getGoodsState() {
		return goodsState;
	}
	/**
	 * @param goodsState the goodsState to set
	 */
	public void setGoodsState(Integer goodsState) {
		this.goodsState = goodsState;
	}
	 
	
	 
}
