
public class Followers implements Observer {

	private String name;
	private Page page=new Page();
	
	public Followers(String string) {
		// TODO Auto-generated constructor stub
		super();
		name=string;
	}	

	public void update()
	{
		System.out.println("Hey" + name +"Going live");
	}
	
	public void FollowInstaPage(Page p)
	{
		page=p;
	}
}
