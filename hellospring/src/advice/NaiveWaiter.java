package advice;

public class NaiveWaiter implements Waiter{

	@Override
	public void greetTo(String name) {
	  System.out.println(" greeting to "+name);
		
	}

}
