package springadvice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class FunnyBehavior extends DelegatingIntroductionInterceptor implements FunnyFace{

	public void doFunnyFace() {
		// TODO Auto-generated method stub		
		System.out.println("  playing a funny face!!!!");
	}
	//∏≤∏«∏∏¿‡∑Ω∑®
	 public Object invoke(MethodInvocation invocation) throws Throwable
		{
			Object obj=null;
			obj=super.invoke(invocation);		
			doFunnyFace();
			return obj;
		}
	
	

}
