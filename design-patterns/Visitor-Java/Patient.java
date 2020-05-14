
public class Patient implements Visitable{

	private String name;
	private String healthStatus;
	
	public Patient(String name)
	{
		super();
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String getHealthStatus()
	{
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus)
	
	{
		this.healthStatus=healthStatus;
	}
	public void accept(visitor v)
	{
		v.visit(this);
	}
}
