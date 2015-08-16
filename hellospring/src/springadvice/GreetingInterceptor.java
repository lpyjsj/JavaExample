package springadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Object[] args=invocation.getArguments();
		String name=(String) args[0];
		System.out.println(" how are you,"+name);
		Object obj=invocation.proceed();
		System.out.println(" hava a nice day!");		
		return obj;
	}

}
