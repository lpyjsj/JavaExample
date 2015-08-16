package springadvice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice{
	
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		String guestName=(String)arg1[0];
		System.out.println("Nice to meet you! Mr." +guestName);		
		
	}


}
