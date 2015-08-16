package strategy;

public abstract class Bird {
	private Flyable flyable;
	private String name;

	public Bird(String name) {
		this.name = name;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void fly() {
		flyable.fly();
	}

}

class Eagle extends Bird {

	public Eagle() {
		super("eagle");
	}

}

class Penguin extends Bird {
	public Penguin() {
		super("eagle");
	}
}
