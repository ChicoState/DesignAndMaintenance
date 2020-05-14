
public interface Subject {

	void follow(Followers follower);
	void unfollow(Observer follower);
	void notifyFollower();
	void goLive(String Message);
	
}
