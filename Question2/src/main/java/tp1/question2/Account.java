package tp1.question2;

import java.util.ArrayList;
import java.util.List;

public class Account implements Publisher {
	
	// Publisher variables
	private List<Subscriber> subscribers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	// Account variables
	private float interest;
	
	public Account(float i) {
		this.subscribers=new ArrayList();
		this.interest=i;
	}
		
	public void SetInterest(float i)
	{
		this.interest=i;
		//publish clientNotificationEvent
		NotifySubscribers();
		
	}		

	public float GetInterest(){return this.interest;}
	
	@Override
	public void Register(Subscriber obj) {
		if(obj == null) throw new NullPointerException("Null subscriber");
			if(!subscribers.contains(obj)) subscribers.add(obj);
	}

	@Override
	public void Unregister(Subscriber obj) {
		subscribers.remove(obj);
	}

	@Override
	public void NotifySubscribers() {
		for (Subscriber obj : subscribers) {
			obj.Update();
		}

	}
	
}
