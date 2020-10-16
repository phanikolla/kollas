package com.tw.items;

import com.tw.subCategories.SubCategories;

public class Item implements SubCategories{

	private String itemName;
	private double itemPrice;
	private double disOnItem;
	private int itemWeight;
	private int itemQuantity;
	private double itemVolume;
	
	public Item(String itemName, double itemPrice, double disOnItem, int itemWeight, int itemQuantity,
			double itemVolume) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.disOnItem = disOnItem;
		this.itemWeight = itemWeight;
		this.itemQuantity = itemQuantity;
		this.itemVolume = itemVolume;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getDisOnItem() {
		return disOnItem;
	}
	public void setDisOnItem(double disOnItem) {
		this.disOnItem = disOnItem;
	}
	public int getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getItemVolume() {
		return itemVolume;
	}
	public void setItemVolume(double itemVolume) {
		this.itemVolume = itemVolume;
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
