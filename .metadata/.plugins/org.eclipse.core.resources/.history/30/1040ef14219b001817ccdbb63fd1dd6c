package qa.account_app;

import static org.junit.Assert.*;

import org.junit.Test;

import accountsystem.Accountdetails;
import accountsystem.Accountservices;



public class AccountTest {
	
	
	
	@Test
	public void newaccount() {
	
	   
	 
	   Accountservices hash = new Accountservices();
	   hash.addaccounts("1",new Accountdetails("bob","dylan","3255" ));
	   hash.addaccounts("2", new Accountdetails("Mike","Mathers","54545"));

	    assertEquals (2, hash.getAccountsMap().size());
	    
	 
	}
	
	
	

}
