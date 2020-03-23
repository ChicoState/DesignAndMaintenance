package com.globe;

//Create a Factory to generate object of concrete class based on given information.
public class GlobeFactory {

	public IGlobe getInstances(String name)
	{
		//determines which continent to be passed to instantiate the object
		if(name.equals("Asia"))
			return new Asia();
		
		else if(name.equals("Africa"))
			return new Africa();
		
		else 
			return new Europe();
		
	}
}
