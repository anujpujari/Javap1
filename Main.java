package SimpleBank;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String Uname;
			int Pin;
			byte choice;
			byte chi;
			
			
			System.out.println("\t\tWelcome to simple Bank\n");
			System.out.println("1.New user\t2.Login\t3.Help\t4.Exit");
			byte ch = sc.nextByte();
		
				switch(ch) {
				
					case 1:
						Application a = new Application();
			
						System.out.println("\n\t\tApplication Form");
						a.setvalue();
			
						Personal p =new Personal();
						p.details();
						a.display();
						p.display2();
			
						System.out.println("\nEnter type of Account you have to create:");
						System.out.println("\n1.Saving\t2.Current\t3.Demat");
			
						choice = sc.nextByte();
			
						switch(choice) {
			
							case 1:
				
						}
			

		
		
					case 2:
						System.out.println("\nEnter username:");
						Uname = sc.next();
						System.out.println("\nEnter Pin:");
						Pin = sc.nextInt();
			
						Saving s = new Saving();
						do
						{
							System.out.println("\n1.Deposit money\t2.Withdraw cash\t3.Exit");
							chi = sc.nextByte();
			
							switch(chi) {
							
							case 1:
								
								System.out.println("\nEnter Pin:");
								int pin = sc.nextInt();
								
								if(Pin == pin)
									s.Deposit2();
					
							case 2:
								System.out.println("\nEnter Pin:");
								pin = sc.nextInt();
					
								if(Pin == pin)
									s.Withdraw();
						
						
							}System.out.println("\nWant to go Menu 2 press 1");
							chi = sc.nextByte();
						}while(chi == 1);
				}
		
	}
}

