
public class NeuroDoctor implements visitor {

	private String name;
	
	public NeuroDoctor(String name)
	{
		super();
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public void visit(Visitable visitable) {
		// TODO Auto-generated method stub
		Patient patient=(Patient)visitable;
		patient.setHealthStatus("Serious");
		System.out.println("Neuro surgeon "+ this.getName()+" did the check up of the patient"+ patient.getName()+" found health is serious");
	}
	
}
