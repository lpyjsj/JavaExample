package aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeGreetingAspect {

	@Before("execution(* greetTo(..))")
	public void beforeGreeting() {
		System.out.println(" Nice to meet you!!!");
	}

}
