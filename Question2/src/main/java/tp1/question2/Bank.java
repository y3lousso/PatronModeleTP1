package tp1.question2;

public class Bank extends Subject{

	private float interestRate;
	
	public Bank() {
		interestRate = 0f;
	}
		
	public float GetInterest() 
	{
		return interestRate;	
	}
	
	public void SetInterest(float newInterest) 
	{
		interestRate = newInterest;	
	}

}