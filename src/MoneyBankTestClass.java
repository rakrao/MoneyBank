//This code deals about creating bank details
import java.util.Scanner;

public class MoneyBankTestClass {
public static void main(String[] args) {
	
	MoneyBank moneybank = new MoneyBank(0, 10000, null);
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter name and initial balance to open the account");
	String name = scanner.nextLine();
	double balance = scanner.nextDouble();
			System.out.println("Account has been created. Name:"+name);
			
			System.out.println("Initial balance=:" +balance);
			
			moneybank.setBalance(balance);
			moneybank.setAccountbalance(balance);


System.out.println("Choose the option");

System.out.println("1.Balance");
System.out.println("2.Withdraw");
System.out.println("3.Deposit");

int choice;
choice = scanner.nextInt();

switch(choice) {    //switch is used to test different cases 
case 1:
       System.out.println("Balance=" + moneybank.getAccountbalance());
       break;
case 2:
    System.out.println("Enter the amount to be withdrawn");
    double amount = scanner.nextDouble();
    
    amount = moneybank.withdraw(amount);
    if(amount == 0)
    {
    	System.out.println("Insufficient balance");
    }else {
    	System.out.println("Account Balance" + amount);
    }
    break;
case 3:
	System.out.println("Enter the amount to be deposited");
	double depositant = scanner.nextDouble();
	moneybank.setBalance(depositant);
	depositant = moneybank.deposit(depositant);
	System.out.println("Account Balance" + depositant);
	break;
}
}
}
