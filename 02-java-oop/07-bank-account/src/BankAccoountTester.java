
public class BankAccoountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount myBankAccount = new BankAccount();
myBankAccount.depositMoney(100.49, "checking");
myBankAccount.depositMoney(3.00, "savings");
myBankAccount.displayAccountBalance();

System.out.println(BankAccount.totalHoldings);

myBankAccount.withdrawMoney(50, "checking");
myBankAccount.withdrawMoney(50, "savings");
myBankAccount.displayAccountBalance();

System.out.println(BankAccount.totalHoldings);
}
	}

}
