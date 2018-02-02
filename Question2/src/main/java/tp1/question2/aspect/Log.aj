package tp1.question2.aspect;

public aspect Log {

	pointcut pointsATracer() : execution(* *.*(..)) && !within(Log);
	
	before(): pointsATracer() 
	{ 
		System.out.println("Before");  	
	}
	
	after(): pointsATracer() 
	{ 
		System.out.println("After"); 
	} 
	

}
