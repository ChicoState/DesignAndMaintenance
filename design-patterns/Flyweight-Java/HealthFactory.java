import java.util.HashMap;

class healthFactory{
	private static HashMap<String,HealthProffesionals> h= new HashMap<String,HealthProffesionals>();
	
	public static HealthProffesionals getprofession(String type)
	{
		HealthProffesionals p=null;
		if(h.get(type)!=null) {
		p=h.get(type);
		}
		else
		{	switch(type) {
			case"Doctors":
				System.out.println("Doctor created");
				p=new Doctors();
				break;
			case"Nurses":
				System.out.println("Nurse cerated");
				p=new Nurses();
				break;
				default:
					System.out.println("No such profession");
		}
		h.put(type,p);
		}
		return p;
	}
}