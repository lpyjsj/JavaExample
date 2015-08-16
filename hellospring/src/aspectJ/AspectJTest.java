package aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aspectJ.xml");
		Waiter waiter=(Waiter)context.getBean("waiter");
		waiter.greetTo("Wu Yanzu");
		
		((FunnyFace)waiter).doFunnyFace();

	}

}
