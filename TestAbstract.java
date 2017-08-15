abstract class Account{
	int accountNo;
	String accountName;
	String accountType;
	int balance;
	void showBalance(){
		System.out.println("Balance"+balance);
	}
	void showAccountDetails(){
		System.out.println("Account no"+accountNo);
		System.out.println("Account name"+accountName);
		System.out.println("Account Type"+accountType);
	}
	abstract void createAccount(int ano,String name);
	abstract void deposit(int amt);
}
class SBAccount extends Account{
	void createAccount(int ano,String name)
	{
		accountNo=ano;
		accountName=name;
		accountType="SB";
	}
	void deposit(int amt){
		balance=balance+amt;
	}
}
class TestAbst{
	public static void main(String ar[]){
		SBAccount account=new SBAccount();
		account.createAccount(11212,"Rajesh");
		account.showAccountDetails();
		account.deposit(3050);
		account.deposit(1231);
		account.showBalance();
		}
}