package tp1.question2;

public interface Subscriber {

	//method to update the publisher, used by publisher
	public void Update();
	
	//attach with subject to observe
	public void SetPublisher(Publisher publisher);

		
}
