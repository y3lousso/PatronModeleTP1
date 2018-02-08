package tp1.question2.aspect;

import tp1.question2.Client;
import tp1.question2.Observer;
import tp1.question2.Subject;

public aspect ObserserAspect {

	pointcut RegisterPointCut(Subject subj) : 
		execution(public void *.Subscribe(Subject) ) &&
		args(subj);

		after(Subject subj): RegisterPointCut(subj) 
		{ 					
			subj.Register((Observer)thisJoinPoint.getThis());		
		} 
	
	pointcut UnregisterPointCut() : 
		execution(public void *.Unsubscribe() );

		before(): UnregisterPointCut() 
		{ 		
			Subject subj = ((Client)thisJoinPoint.getThis()).GetSubject();
			subj.Unregister((Observer)thisJoinPoint.getThis());		
		}
	
	
	pointcut NotifyPointCut() : 
		execution(public void *.SetInterest(*));
	
		after(): NotifyPointCut() 
		{ 
			((Subject)thisJoinPoint.getThis()).NotifyObservers();
		} 
}
