package facade;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Saving implements IAccount {
	
	Logger logger = Logger.getLogger(Saving.class.getName());
	private BigDecimal amount;
	private Integer accountNumber;	

	public Saving(BigDecimal amount) {
		super();
		this.amount = amount;
		this.accountNumber = 1;
	}

	@Override
	public Integer getAccountNumber() {		
		return this.accountNumber;
	}

	@Override
	public void deposit(BigDecimal amount) {
		this.amount = this.amount.add(amount);
		logger.log(Level.INFO, "Deposit {0}", amount);
		logger.log(Level.INFO, "Balance {0}", this.amount);
	}

	@Override
	public void withdraw(BigDecimal amount) {
		this.amount = this.amount.subtract(amount);
		logger.log(Level.INFO, "Withdraw {0}", amount);
		logger.log(Level.INFO, "Balance {0}", this.amount);
	}
	
}
