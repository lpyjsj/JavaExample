package strategy;

public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eagle eagle = new Eagle();
		eagle.setFlyable(new HighAndFast());
		Penguin penguin = new Penguin();
		penguin.setFlyable(new CannotFly());

		eagle.fly();
		penguin.fly();
	}

}
