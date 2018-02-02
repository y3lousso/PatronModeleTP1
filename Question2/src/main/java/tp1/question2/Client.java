package tp1.question2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private List<Account> _accounts;
	
	public Client(String n)
	{
		_accounts = new ArrayList<Account>();
		this.name=n;		
	}
	
	public void AddAccount(Account account) 
	{		
		_accounts.add(account);
	}
	
}
