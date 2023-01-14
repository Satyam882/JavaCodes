package banking;

import java.time.LocalDate;
import custom_exceptions.BankingException;
import static  utils.BankingUtils.validateBalance;
public class BankAccount {
	private int accNo;
	private String customerName;
	private double balance;
	private AcctType acType;
	//private LocalDate creationDate;
	
	
	public BankAccount(int accNo, String customerName, double balance, AcctType acType) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.balance = balance;
		this.acType = acType;
		//this.creationDate = creationDate;
	}


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", customerName=" + customerName + ", balance=" + balance + ", acType="
				+ acType +  "]";
	}
	
	public void deposit(double amount)
	{
		this.balance +=amount;
	}
	public void withdraw(double amount) throws BankingException
	{
		validateBalance(this.balance-amount);
		this.balance-=amount;
	}
	public void transferFunds(double amount,BankAccount destAcct) throws BankingException
	{
		this.withdraw(amount);
		destAcct.deposit(amount);
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public AcctType getAcType() {
		return acType;
	}


	public void setAcType(AcctType acType) {
		this.acType = acType;
	}


	


	
	
	

}
