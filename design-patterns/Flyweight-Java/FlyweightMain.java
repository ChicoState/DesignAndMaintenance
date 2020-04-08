import java.util.Random;

public class FlyweightMain {

	private static String Proffesion[]= {"Doctors","Nurses"};
	private static String specialization[]= {"Veternaty","Neurosurgen","Heart specialist","oncologist"};
	
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			HealthProffesionals obj=healthFactory.getprofession(getRandomProffesion() );
				
				obj.setSpecialization(getSkill());
				obj.treat();
				
			
		}
	}
		public static String getRandomProffesion() {
			Random r=new Random();
			int RandomNum=r.nextInt(Proffesion.length);
			
			return Proffesion[RandomNum];
		}
		
		public static String getSkill() {
			Random r=new Random();
			int RandomNo=r.nextInt(specialization.length);
			
			return specialization[RandomNo];
		}
	}

