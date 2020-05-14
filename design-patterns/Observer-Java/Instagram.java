
public class Instagram {

	
	public static void main(String[] args)
	{
		Page justinBeiber=new Page();
		Followers f1=new Followers("Pratiksha");
		Followers f2=new Followers("Zaiba");
		Followers f3=new Followers("Diksha");
		
		justinBeiber.follow(f1);
		justinBeiber.follow(f2);
	
		
		f1.FollowPage(justinBeiber);
		f2.FollowPage(justinBeiber);
		
		justinBeiber.goLive("What do I do in Quarantine...?");
		{
			
		}
	}
	
}
