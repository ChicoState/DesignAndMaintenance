package com.prototype;

/* File : PrototypeMain.java
 * @Author: Pratiksha Kapse 
 * This is a main class uses GrosseryShop class to get clones of Items.
 */

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		GrosseryShop winco = new GrosseryShop();

		winco.setName("Winco");
		winco.loadData();
		GrosseryShop walmart = (GrosseryShop) winco.clone();
		walmart.setName("Walmart");
		System.out.println(winco);
		System.out.println(walmart);
	}

}
