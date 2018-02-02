package tp1.question2;

public class Account {
	
	private Bank bank;
	private Client client;
	private float interest;
	
	public Account(Bank b, Client c,float i) {
		this.bank = b;
		this.client=c;
		this.interest=i;
	}
	
	public void SetInterest(float i){this.interest=i;}	
	public float GetInterest(){return this.interest;}
	
	public Client GetClient(){return this.client;}

	public Bank GetBank(){return this.bank;}
	
}
