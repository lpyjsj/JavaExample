package strategy;

public interface Flyable {
	void fly();
}

class HighAndFast implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly high and fast");
	}
}

class CannotFly implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Can not fly ");
	}
}
