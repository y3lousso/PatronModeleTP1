package tp1.question2.aspect;

public aspect LogAspect {

	pointcut FunctionExecutionOrder() : execution(public void *.*(*)) && !within(LogAspect);
	
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
