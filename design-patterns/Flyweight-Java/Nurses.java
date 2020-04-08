class Nurses implements HealthProffesionals{
	
	private final String work;
	private String  specialization;
	
	public Nurses()
	{
		work="supervise patient and report to doctors";
	}
	public void setSpecialization(String specialization)
	{
		this.specialization=specialization;
	}
	public void treat()
	{
		System.out.println("Nurses wit skills : "+ this.specialization);
		System.out.println(" with job of: "+work);
	}
}