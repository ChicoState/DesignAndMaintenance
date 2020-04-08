public class DecoratorPattern{

	public static void main(String[] args) {
		Car sportsCar = new SportsDecorator(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsDecorator(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}