package springadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("advice.xml");
		Waiter waiter=(Waiter)context.getBean("waiter");
		waiter.greetTo("Li Lei");
		System.out.println("---------------------");
		Waiter waiterRegexp=(Waiter)context.getBean("waiter-regexp");
		waiterRegexp.greetTo("Han Meimei");
		
		System.out.println("---------------------");
		Waiter waiterFlow=(Waiter)context.getBean("waiterFlow");
		WaiterDelegate waiterDelegate=new WaiterDelegate(waiterFlow);
		waiterDelegate.greetTo("Jim Green");

	}

}
