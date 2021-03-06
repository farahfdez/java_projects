package facade;

import java.math.BigDecimal;
import java.util.HashMap;

public class BankingFacade {
	
	private HashMap<Integer, IAccount> bankAccounts;

	public BankingFacade() {
		super();
		this.bankAccounts = new HashMap<>();
	}
	
	public IAccount createNewAccount(String type, BigDecimal initialAmount) throws Exception {
		IAccount newAccount;
		switch (type) {
		case "Saving" :
			newAccount = new Saving(initialAmount);
			break;
		
		case "Investment" : 
			newAccount = new Investment(initialAmount);
			break;
		
		case "Checking" : 
			newAccount = new Chequing(initialAmount);		
			break;
		
		default :
			newAccount = null;
			break;
		}
		
		if (newAccount != null) {
			bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			return newAccount;
		} else {
			throw new Exception("Account type not supported");
		}
	}
	
	public void withdraw(Integer accountNumber, BigDecimal amount) {
		IAccount account = bankAccounts.get(accountNumber);
		account.withdraw(amount);		
	}
	
	public void deposit(Integer accountNumber, BigDecimal amount) {
		IAccount account = bankAccounts.get(accountNumber);
		account.deposit(amount);
	}
	
	
	

}
