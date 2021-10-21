import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts;
	private static double totalMoney;
	
	//Constructor
	public BankAccount() {
		this.accountNumber = this.randAccountNumber();
		this.checkingBalance = 0;
		
		numberOfAccounts++;
		
	}
	
	
	
	//Method
	private String randAccountNumber() {
		String accountNumber = "";
		
		Random r = new Random();
		for(int i=0; i<10; i++) {
			accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
		}		
		return accountNumber;
	}
	public void depositMoney(double amount,String accountType) {
		if(accountType.equals("checking")) {
			this.setCheckingBalance(this.getCheckingBalance() + amount);
			totalMoney += amount;
		}else if(accountType.equals("saving")) {
			this.setSavingsBalance(this.getSavingsBalance() + amount);
			totalMoney += amount;
		}else {
			System.out.println("Invalid Account Type");
			return;
		}
		totalMoney += amount;
	}
	public void withdrawMoney(double amount,String accountType) {
		 if(accountType.equals("checking")) {
			 if(this.getCheckingBalance() < 0) {
				 System.out.println("Insufficient Funds");
			 }else {
				 this.setCheckingBalance(getCheckingBalance() - amount);
				 totalMoney -= amount;
			 }
			 }else if(accountType.equals("saving")) {
				 if(this.getSavingsBalance() < 0) {
					 System.out.println("Insufficient Funds");
			}else {
				this.setSavingsBalance(getSavingsBalance() - amount);
				totalMoney -= amount;
				 }
			 }
			 else {
					System.out.println("Invalid Account Type");
					return;
				}
				totalMoney -= amount;
		 
	
	public String accountTotal() {
		return "Total Money in account:" this.getCheckingBalance() + this.getSavingsBalance();
//Getters Setters
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getCheckingBalance() {
		return checkingBalance;
	}



	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}



	public double getSavingsBalance() {
		return savingsBalance;
	}



	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}



	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}



	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}



	public static double getTotalMoney() {
		return totalMoney;
	}



	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
	}

