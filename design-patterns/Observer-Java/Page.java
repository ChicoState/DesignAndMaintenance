import java.util.ArrayList;
import java.util.List;

public class Page implements Subject {

	
	public List<Followers> f=new ArrayList<>();
	String message;
	@Override
	public void follow(Followers follower) {
		// TODO Auto-generated method stub
		f.add(follower);
	}

	@Override
	public void unfollow(Observer follower) {
		// TODO Auto-generated method stub
		f.remove(follower);
	}

	@Override
	public void notifyFollower() {
		// TODO Auto-generated method stub
	
		for (Followers follow: f)
		{
			follow.update();
		}
	}

	@Override
	public void goLive(String Message) {
		// TODO Auto-generated method stub
		this.message=message;
		notifyFollower();
	}

	
}
