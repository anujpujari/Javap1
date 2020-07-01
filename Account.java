
public class Account {
	String cname;
	String address;
	double pincode;
	String gender;
	public Account(String cname, String address, double pincode, String gender) {
		super();
		this.cname = cname;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void details() {
		System.out.println("Please enter your personal details :");
		System.out.println("\nEnter you Name :\t");
		
	}
	
	

}
