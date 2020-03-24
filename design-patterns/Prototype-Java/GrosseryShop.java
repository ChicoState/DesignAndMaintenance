package com.prototype;

import java.util.List;
import java.util.ArrayList;

/* File : GrosseryShop.java
 * @Author: Pratiksha Kapse 
 * This class represents list of items and particular shop. 
 */
//By implementing Cloneable we allow java to copy objects of this class
public class GrosseryShop implements Cloneable {

	private String name;// name of the shop
	List<Item> items = new ArrayList<>();// List of items as an object

	@Override // implementation of toString from the Object class
	public String toString() {
		return "GrosseryShop [name=" + name + ", items=" + items + "]";
	}

	// getter and setter for shop names
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter and setter for list of items
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	// Implementation of clone() method from cloneable interface
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	// false code to load data instead of calling from database.
	public void loadData() {
		// we are creating 5 items
		for (int i = 0; i < 5; i++) {
			Item o = new Item();
			o.setItemId(i); // set i as an id
			o.setItemName("Book" + i); // set names as Book1,Book2.....
			getItems().add(o); // Add each of these as an object to the list.
		}
	}
}
