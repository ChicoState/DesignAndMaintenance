public class SportsDecorator extends CarDecorator {

	public SportsDecorator(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}