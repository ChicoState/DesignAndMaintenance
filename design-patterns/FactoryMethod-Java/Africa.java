package com.globe;

public class Africa implements IGlobe{

	
	public int population;
	public float affected_population;
	private float rate;
	
	Africa()
	{
		population=64000;
		affected_population=40;
	}
	public void displayRate()
	{
		rate=(affected_population / population) * 100;
		System.out.println("Africa has "+ rate +" population affetced by COVID-19");
		
	}
}
