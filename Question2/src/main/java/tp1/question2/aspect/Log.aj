package tp1.question2.aspect;

import org.aspectj.lang.reflect.MethodSignature;

public aspect Log {

	pointcut FunctionExecutionOrder() : execution(public void *.*(*)) && !within(Log);
	
	before(): FunctionExecutionOrder() 
	{ 
		String functionName = thisJoinPoint.getSignature().getName();
		System.out.println("Entering :" + functionName);  	
	}
	
	after(): FunctionExecutionOrder() 
	{ 
		String functionName = thisJoinPoint.getSignature().getName();
		System.out.println("Exiting :"+ functionName); 
	} 
	

}
