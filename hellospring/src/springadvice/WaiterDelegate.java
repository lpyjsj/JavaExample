package springadvice;

public class WaiterDelegate {
	private Waiter waiter;
	
	WaiterDelegate(Waiter waiter)
	{ this.waiter=waiter;}
	
	public void greetTo(String name)
	{
		waiter.greetTo(name);
	}
	

}
