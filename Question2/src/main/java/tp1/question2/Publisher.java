package tp1.question2;

public interface Publisher{

	//methods to register and unregister Subscribers
	public void Register(Subscriber obj);
	public void Unregister(Subscriber obj);
	
	//method to notify Subscribers of change
	public void NotifySubscribers();
	
}
