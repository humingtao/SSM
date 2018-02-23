package org.malajava.entity;

import java.io.Serializable;

public class CartModel implements Serializable{
	private int id;
	private int member_id;
	private int good_id;
	private double sale_price;
	private double real_sale_price;
	private int count;
	private int offline_shop_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getGood_id() {
		return good_id;
	}
	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public double getReal_sale_price() {
		return real_sale_price;
	}
	public void setReal_sale_price(double real_sale_price) {
		this.real_sale_price = real_sale_price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getOffline_shop_id() {
		return offline_shop_id;
	}
	public void setOffline_shop_id(int offline_shop_id) {
		this.offline_shop_id = offline_shop_id;
	}
	
	
	
}
