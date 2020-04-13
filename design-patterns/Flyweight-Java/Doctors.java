class Doctors implements HealthProffesionals{
	
	private final String work;
	private String  specialization;
	
	public Doctors()
	{
		work=" Treat patients and prescribe medicones";
	}
	
	public void setSpecialization(String specialization)
	{
		this.specialization=specialization;
	}
	public void treat()
	{
		System.out.println("Doctors with specialization: "+ this.specialization);
		System.out.println(" with job of: "+ work);
	}
}