package tester;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import banking.AcctType;
import banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankingUtils.*;
public class Bank {
	public static void main(String[ ] args)
	{
		try(Scanner sc=new Scanner (System.in))
		{
			Map<Integer,BankAccount> acc=populateBankAccounts();
		boolean exit =false;
		while(!exit)
		{
			System.out.println("Options 1. Create A/C 2. Display all accts 3. Fetch A/C Summary "
					+ "4. Transfer Funds 5. Close A/c 100.Exit");
		try {
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter acct acctNo");
				int acctNo=sc.nextInt();
				if(!acc.containsKey(acctNo))
				{
					System.out.println("Enter other details : customerName,  balance,  acType,  creationDate ");
				acc.put(acctNo,new BankAccount(acctNo,sc.next(),validateBalance(sc.nextDouble()), null));
				AcctType.valueOf(sc.next().toUpperCase());
				}
				else
					
					throw new BankingException("dup acctno");
			break;
			case 2:
				System.out.println("All Bank Accounts");
				for (BankAccount a : acc.values())
					System.out.println(a);
				break;
			}
		}
		catch (Exception e) {
		e.printStackTrace();
		sc.nextLine();
		}
			
		}
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
