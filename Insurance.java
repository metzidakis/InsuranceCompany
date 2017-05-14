
public class Insurance {

	/*
	Described by: insurance code  (auto-increment ) , duration and customer. (The instance variables declared as private) 
			Contains methods:  
			Setters/getters
			toString ()
			method for calculating insurance_cost returning:
			A fixed price of 100 euro: 
			method for printing all stored insurances
			method for printing a particular insurance (argument : insurance code)
	Each  generated Insurance object should be stored in an array  (length=10).
	*/
	
	// instance variables
	protected static int insuranceCode = 0;
	int code = 0;
	private static boolean a = false;
	private String duration;
	private Customer customer;
	static Insurance[] insuranceDatabase = new Insurance[100];
		
	//constructor
	Insurance ( String duration, Customer customer ) {
		this.code = insuranceCode;
		this.duration = duration;
		this.customer = customer;
		Insurance.insuranceDatabase[code] = this;
		insuranceCode++;
	}
	
	//getters
	public int getInsuranceCode() {
		return code;
	}
	public String getDuration() {
		return duration;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	//setters
	public void setDuration(String duration) {
		this.duration = duration;
	}	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//method to String	
	public String toString() {
		return ("Insurance Code: " + code + ", Duration: " + duration + ", Customer: " + getCustomer().toString() );
	}
	
	//method to calculating insurance cost
	public double insuranceCost() {
		return 100;
	}
	
	//method for printing all stored insurance
	public static void printAllInsurance () {
		for (int i = 0; i < 100; i++ ) {
			if (insuranceDatabase[i] != null) {
				System.out.println(insuranceDatabase[i].toString());
			}	
		}
	}
	
	//method for printing a particular insurance (argument : insurance code)
	public static void printInsuranceFromInsuranceCode(int proxy) {
		a = true;
		for (int i = 0; i <= 9; i++) {
			if ( insuranceDatabase[i].getInsuranceCode() == proxy ) {
				System.out.println(insuranceDatabase[i].toString());
				a = false;
			}
		}
		if (a == true) {
			System.out.println("No insurance with the particular code found");
		}
	}
	
	//method for printing a particular insurance (argument : customer code)
	public static void printInsuranceFromCustomerCode(int proxy) {
		a = true;
		for (int i = 0; i <= 9; i++) {
			if ( insuranceDatabase[i].getCustomer().getCustomerCode() == proxy ) {
				System.out.println(insuranceDatabase[i].toString());
				a = false;
			}
		}
		if (a == true) {
			System.out.println("No insurance with the particular code found");
		}
	}
		
		
	
}
