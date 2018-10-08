package accountsystem;

import java.util.*;
public class Accountservices {
	
private HashMap<Integer,Accountdetails> accounts;
private static int count = 0;

public Accountservices() {
	
	accounts = new HashMap<Integer, Accountdetails>();
	
}

public void addaccounts (Accountdetails account) {
	accounts.put(count, account);
	count++;
}

public Accountdetails getAccount() {

  return this.accounts.get(count);
 


}

public HashMap<Integer, Accountdetails> getAccountsMap() {
	return accounts;
}

public void setAccountsMap(HashMap<Integer, Accountdetails> accounts) {
	this.accounts = accounts;
}



}



