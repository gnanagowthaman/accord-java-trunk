abstract class Account{
	int accountNo;
	String accountName;
	String accountType;
	int balance;
	
	void showBalance()
	{
		System.out.println("Balance"+balance);
	}
	
	void showAccountDetails()
	{
		System.out.println("Account No"+accountNo);
		System.out.println("Account Name"+accountName);
		System.out.println("Account Type"+accountType);
		
	}
	abstract void createAccount(int ano,String name);
	abstract void deposit(int amt);
	abstract void termsOfDeposit(int at,int ct);
	
}
class RDAccount extends Account{
	void createAccount(int ano,String name)
	{
		accountNo=ano;
		accountName=name;
		accountType="CA";
	}
	void deposit(int amt)
	{
		balance=balance+amt;
	}
	void termsOfDeposit(int at,int ct){
	    int r=12;
		if(at>1000 || at< 1000)
		{
			System.out.println("Error occurs in due to low deposit");
			
		}
		else
		{
			balance=balance+at; 
			
		}
		if(ct==12)
		{
			System.out.println("Installment finished");
		}
		else if(at>1000||at<1000)
		{
			System.out.println("Can't calculate no of installment because of low deposit"+at+"Enter deposit amount u mentioned");
		}
		else
		{
	        r=r-ct;
		    System.out.println("Installment pending"+r);	
			
		}
	}
}
class TestCr{
	public static void main(String ar[])
	{
		RDAccount account=new RDAccount();
		account.createAccount(11212,"ssiva");
		account.showAccountDetails();
		account.deposit(3000);
		account.deposit(1000);
		account.showBalance();
		account.termsOfDeposit(1000,3);
		account.showBalance();
	}
}	