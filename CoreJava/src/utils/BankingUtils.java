package utils;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import banking.*;
import custom_exceptions.*;
import static banking.AcctType.*;
public class BankingUtils {

	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE =4000;
	}
	public static double validateBalance(double balance) throws BankingException
	{
		if(balance<MIN_BALANCE)
		
			throw new BankingException("low amount");
			return balance;
	}
	public static Map<Integer,BankAccount> populateBankAccounts() throws BankingException
	{
		Map<Integer, BankAccount> accts=new HashMap<>();
		System.out.println(accts.put(101,new BankAccount(101,"satyam",validateBalance(10000), CURRENT)));
		System.out.println(accts.put(102,new BankAccount(102, "bhushan",validateBalance(4000), SAVINGS)));
		System.out.println(accts.put(103,new BankAccount(103, "rohitt",validateBalance(6000), FD)));
		System.out.println(accts.put(104,new BankAccount(104, "manish",validateBalance(4000), DMAT)));
		
		
	return accts;
	}
	public static AcctType validateAcctType(String type)
	{
		return AcctType.valueOf(type.toUpperCase());
	}
}
