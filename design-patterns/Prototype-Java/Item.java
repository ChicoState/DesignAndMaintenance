package com.prototype;

/* File : Item.java
 * @Author: Pratiksha Kapse 
 * This class represents properties of an items in the grossery shop.
 */
public class Item {

	private int itemId;
	private String itemName;

	// getter and setter for Item Id
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	// getter and setter for Item name
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}

}
