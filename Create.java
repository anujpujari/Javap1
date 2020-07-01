import java.util.Scanner;

public class Create {
	
	
	public static void accept() {
		int ch;
		
		System.out.println("Enter your Choice : \n1.Saving Account \n2.Current Account \n3.Demat Account");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch) {
		  case 1:
			  Saving s=new Saving(null, null, ch, null);
				s.accepts();
			
			
		}
		
	}

}
