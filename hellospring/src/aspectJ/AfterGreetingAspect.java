package aspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterGreetingAspect {

	@AfterReturning("execution(* greetTo(..))")
	public void afterGreeting() {
		System.out.println("please enjoy yourself!");
	}

}
