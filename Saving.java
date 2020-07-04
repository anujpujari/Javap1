package SimpleBank;
import java.util.Scanner;

public class Saving extends Application{
		Scanner sc = new Scanner(System.in);
	
		long Amt,Balence;
		String uname;
		int pin;
	
	public void Deposit() {
		
		System.out.println("Welcome "+name+"\t"+name2+"\t"+name3);
		
		System.out.println("Enter Amount to Deposit:");
		Amt = sc.nextLong();
		if(Amt < 500)
			System.out.println("Please enter amount greater than 500");
		else 
			Balence = Balence + Amt;
			System.out.print("Money Deposited.."+Balence);
	}
	public void Deposit2() {
		System.out.println("Enter Amount to Deposit:");
		Amt = sc.nextLong();
		if(Amt < 0)
			System.out.println("Please Enter valid amount");
	    else
			Balence = Balence + Amt;
			System.out.print("Money Deposited.."+Balence);
	}
	
	public void Withdraw() {
		
		System.out.println("\nEnter amount you want to withdraw:");
		Amt = sc.nextLong();
		if(Amt > Balence)
			System.out.println("\nPlease Enter valid amount");
		else
			Balence = Balence - Amt;
			
		System.out.println("\nRemaining Balence is"+Balence);
		
	}
}
