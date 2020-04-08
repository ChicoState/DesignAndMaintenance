package com.globe;

public class Europe implements IGlobe {

	public int population;
	public float affected_population;
	private float rate;
	
	public Europe()
	{
		population=741000000;
		affected_population=20000;
	}
	public void displayRate()
	{   
		rate=(affected_population/population)*100; 
		System.out.println("Europe has "+ rate +" population affetced by COVID-19");
		
		
	}
}
