package aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableFunnyBehaviorAspect {
	@DeclareParents(value="aspectJ.NaiveWaiter",defaultImpl=aspectJ.FunnyBehavior.class)
	public FunnyFace funnyFace;

}
