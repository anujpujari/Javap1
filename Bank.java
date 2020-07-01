

public class Bank {
	String name;
	

	
	public Bank(String name) { //constructor
		super();
		this.name = name;
		
	}
	
	public String getName() { //getter methods
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void display()	
	{
		System.out.println("Welcome to SBI Bank");
	}
	
}
