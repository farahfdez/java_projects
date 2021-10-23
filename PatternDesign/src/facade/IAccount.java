package facade;

import java.math.BigDecimal;

public interface IAccount {
	
	public Integer getAccountNumber();
	public void deposit(BigDecimal amount);
	public void withdraw(BigDecimal amount);

}
