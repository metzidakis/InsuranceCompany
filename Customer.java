
public class Customer {

	/*  Described by : customer’s code (auto-increment) name, year of birth and sex (male / female)
				       Contains methods:  
				       Getters/setters
				       toString()

		Each  generated Customer object should be stored in an array  (length=10).
	 */
	
	// instance variables
	private static int customerCode = 0;
	private int code;
	private String name;
	private int yearOfBirth;
	private String sex;
	public static Customer[] customerDatabase = new Customer[100];
	
	//constructor
	Customer ( String name, int yearOfBirth, String sex) {
		this.code = customerCode;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.sex = sex;
		Customer.customerDatabase[code] = this;
		customerCode++;
	}
	
	//getters
	public int getCustomerCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public String getSex() {
		return sex;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//method to String	
	public String toString() {
		return ("Customer Code: " + getCustomerCode() + ", Name: " + getName() + ", yearOfBirth: " + getYearOfBirth() + ", Sex: " + getSex() );
	}

}
