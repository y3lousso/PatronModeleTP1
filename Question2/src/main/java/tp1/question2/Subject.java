package tp1.question2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{

	protected List<Observer> _observers = new ArrayList<Observer>();
	
	//methods to register and unregister Observers
	public void Register(Observer obj) 
	{
		if(_observers != null)
			_observers.add(obj);
		
	}
	
	public void Unregister(Observer obj)
	{
		if(_observers != null)
			_observers.remove(obj);
	}
	
	//method to notify Observers of change
	public void NotifyObservers()
	{
		if(_observers != null) {
			for (Observer obj : _observers) 
			{
				obj.Update();
			}
		}
	}
	
}
