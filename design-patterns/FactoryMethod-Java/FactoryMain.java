import com.globe.Asia;
import com.globe.GlobeFactory;
import com.globe.IGlobe;

//Use the Factory to get object of concrete class by passing an information such as which continent.
public class FactoryMain {

	public static void main(String arg[])
	{
		GlobeFactory g=new GlobeFactory();
		
		IGlobe obj=g.getInstances("Africa");
		obj.displayRate();
		
		IGlobe obj1=g.getInstances("Europe");
		obj1.displayRate();
	}
}
