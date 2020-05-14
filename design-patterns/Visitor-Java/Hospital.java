import java.util.ArrayList;

public class Hospital {

	static ArrayList<Patient> patientList;
	
	static {
		patientList=new ArrayList<Patient>();
		
		Patient pratiksha=new Patient("Pratiksha");
		Patient Pranav=new Patient("Pranav");
		Patient Uttkarsh=new Patient("Uttkarsh");
		Patient Ujjwal=new Patient("Ujjwal");
		
		patientList.add(pratiksha);
		patientList.add(Pranav);
		patientList.add(Uttkarsh);
		patientList.add(Ujjwal);
	}
	
	public static void healthCheckup()
	{
		NeuroDoctor n=new NeuroDoctor("Dr. Will Smith");
		for(Patient p:patientList)
		{
			p.accept(n);
		}
	}
}
