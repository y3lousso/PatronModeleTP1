package tp1.question2;

public class Client implements Observer{

	private Subject subject;
	private String name;
	
	public Client(String n)
	{
		this.name=n;		
	}
		
	@Override
	public void Update() 
	{
		OnAccountInterestChange();
	}
	
	public void OnAccountInterestChange() 
	{
		System.out.println("Client " + name + " has received the notification.");
	}
	
	public void Subscribe(Subject subj) 
	{
		subject = subj;
	}
	
	public void Unsubscribe() 
	{
		subject = null;
	}
	
	public Subject GetSubject() 
	{		
	return subject;
	}	
}
