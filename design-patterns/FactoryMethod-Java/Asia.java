package com.globe;

public class Asia implements IGlobe{

	public int population;
	public float affected_population;
	private float rate;
	
	Asia()
	{
		population=1000;
		affected_population=40;
	}
	public void displayRate()
	{   System.out.println("Asia has "+rate+" population affetced by COVID-19");
		
	}
	
}
