package tp1.question2;

public class Client implements Subscriber{

	private String name;
	private Publisher publisher;
	
	public Client(String n)
	{
		this.name=n;		
	}
		
	public void OnAccountInterestChange() {
		System.out.println("Client " + name + " has received the notifcation.");
	}

	@Override
	public void Update() {
		OnAccountInterestChange();
	}

	@Override
	public void SetPublisher(Publisher publ) {
		this.publisher=publ;
	}
	
}
