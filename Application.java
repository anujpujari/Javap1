package SimpleBank;
import java.util.Scanner;
public class Application {
	Scanner sc = new Scanner(System.in);
		protected String name,name2,name3;
		protected String Pan;
		protected long Aadhar;
		byte cho;
		
		public void setvalue() {
			System.out.println("Enter name:");
			name = sc.next();
			name2 = sc.next();
			name3 = sc.next();
			
			System.out.println("Pan number:");
			Pan = sc.next();
			
			System.out.println("Aadhar card number:");
			Aadhar = sc.nextLong();
			if((Aadhar > 12) || (Aadhar < 12))
				System.out.println();
			else
				System.out.println("Enter valid aadhar number");
				
		}
		public void display() {
			System.out.println("------------------------------------");
			System.out.println("Name:"+name+"\t"+name2+"\t"+name3+
					           "\nPan:"+Pan+
					           "\nAadhar No:"+Aadhar);
			System.out.println("------------------------------------");
		}
}
class Personal extends Application{
		
		protected String Bnumber;
		protected String Street;
		protected String City;
		protected int Pincode;
	    protected long DOB;
		protected String Gender;
		protected String Mstatus;
		
		public void details() {
			System.out.println("\n\tPersonal Details\n");
			System.out.println("Enter Date of Birth:DD/MM/YYYY");
			DOB = sc.nextLong();
			System.out.println("Gender:(m)Male\t(f)Female\t(o)other");
			Gender = sc.next();
			System.out.println("\nEnter Address:");
			address();
			
			System.out.println("Religion:");
			System.out.println("\nA.Hindu\tB.Muslim\tC.Sikh\tD.Christian\tE.Other");
			String Rel = sc.next();
			System.out.println("\nCategory:");
			System.out.println("\na.General\tb.OBC\tc.SC\td.ST\te.Other");
			String Cat = sc.next();
			System.out.println("\nEducational Qualification:");
			System.out.println("\n1.Graduate\t2.Non-Graduate\n");
			byte s = sc.nextByte();
			
			switch(s) {
			
			case 1:
				System.out.println("Enter Occupation:");
				System.out.println("A.Self-employeed\tB.Salaried\tC.Business\tD.Other");
				String occ = sc.next();
				System.out.println("Enter Income:");
				long Inc = sc.nextLong();
				break;
				
			case 2:
				System.out.println("1.Student\t2.Housewife\t3.Other");
				byte w = sc.nextByte();
				System.out.println("Enter salary if have:");
				long Inco = sc.nextLong();
				break;
			}
			
			
		}
		public void address() {
			System.out.print("\tStreet name");
			Street = sc.next();
			System.out.print("\tEnter House/Building Number:");
			Bnumber = sc.next();
			System.out.print("\tCity");
			City = sc.next();
			System.out.print("\tEnter Pincode");
			Pincode = sc.nextInt();
	    }
		
		public void display2() {
			System.out.println("\nDOB:"+DOB+"\n");
			if(Gender.contains("m"))
				System.out.println("Male");
			else if(Gender.contains("f"))
				System.out.println("Female");
			else if(Gender.contains("o"))
				System.out.println("Other");
			else
				System.out.println("Wrong input entered");
			System.out.println("Address:"+Street+"\t"+Bnumber+"\t"+City+"\t"+Pincode+"\n");
			System.out.println("------------------------------------");
		}
		
}













/*	try {
if(Gender.equalsIgnoreCase("m"))
	System.out.println("Male");
else if(Gender.equalsIgnoreCase("f"))
	System.out.println("Female");
else if(Gender.equalsIgnoreCase("o"))
	System.out.println("Other");
}catch(Exception e) {
	System.out.println(e);
}*/