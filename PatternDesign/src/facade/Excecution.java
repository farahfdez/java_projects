package facade;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Excecution {
	
	private static Logger logger = Logger.getLogger(Excecution.class.getName());

	public static void main(String[] args) throws Exception {
		BankingFacade service = new BankingFacade();
		IAccount saving = service.createNewAccount("Saving", new BigDecimal(500));
		logger.log(Level.INFO, "It has been created a new saving account wiht number {0}", saving.getAccountNumber());
		IAccount investment = service.createNewAccount("Investment", new BigDecimal(1000));
		logger.log(Level.INFO, 
				"It has been created a new investment account wiht number {0}", investment.getAccountNumber());
		
		service.withdraw(3, new BigDecimal(300));
		service.deposit(1, new BigDecimal(200));

	}

}
