/*******************************************************************************
 * Copyright (c) 2010, 2030 www.itlaobing.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.malajava.entity;

import java.io.Serializable;

/** 
 * ClassName: FocusModel <br/> 
 * Function: TODO 轮播图<br/> 
 * date: 2017年2月18日 下午5:00:17 <br/> 
 * 
 * @author ld 
 * @version  
 * @since JDK 1.8 
 */
public class FocussModel implements Serializable{
	
	private Integer id;
	//标题
	private String title;
	//图片
	private String img;
	//链接url
	private String target_url;
	//权重
	private Double weight;
	//位置
	private int position;

	
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * @return the target_url
	 */
	public String getTarget_url() {
		return target_url;
	}
	/**
	 * @param target_url the target_url to set
	 */
	public void setTarget_url(String target_url) {
		this.target_url = target_url;
	}
	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
