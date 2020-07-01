import java.util.Scanner;

public class Main {

		public static void main(String[] aargs) {
			Bank b=new Bank("SBI");
			b.display();
			
			int choice;
			System.out.println("Enter your choice from below Menu");
			System.out.println("1.Create Account\n2.Loan Information \n3.transfer Money\n4.Withdraw\n5.Deposit");
			Scanner sc=new Scanner(System.in);
			choice =sc.nextInt();
			switch(choice) {
				case 1:
					Create c=new Create();
					c.accept();
					break;
					
			}
					
		}
}
