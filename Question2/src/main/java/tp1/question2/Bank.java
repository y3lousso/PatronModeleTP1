package tp1.question2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	public List<Account> _accounts;
	 
	public Bank() {
		_accounts = new ArrayList<Account>();
	}
	
	public void OpenNewAccountForClient(Client client) 
	{
		Account account = new Account(1f);			
		_accounts.add(account);
		
		//subscribe clientNotificationEvent
		account.Register(client);
	}
	
	public void ChangeInterest(float newInterest) 
	{
		for(int i =0; i <_accounts.size(); i++)
		{
			_accounts.get(i).SetInterest(newInterest);			
		}		
	}

}