
public class Health extends Insurance{
	
	/*
	    Extending Insurance class and further described by:
			the medical expense the customer wants.
			Getters/setters
			toString()
			The cost calculation is 100 euro plus 7 for every Customer’s year and , 50 euros if he is a man and 2,5 % of medical expense 
			Each  generated Health object should be stored in an array  (length=10).

	 */
	
	private double medicalExpense;
	
	//constructor
	Health ( String duration, Customer customer, double medicalExpense ) {
		super (duration, customer);
		this.medicalExpense = medicalExpense;
	}
	
	//getter
	public double getMedicalExpense() {
		return medicalExpense;
	}
		
	//setter
	public void setMedicalExpense(double medicalExpense) {
		this.medicalExpense = medicalExpense;
	}
		
	//method toString
	@Override
	public String toString() {
		//return ("Insurance's Code: " + getInsuranceCode() + ", Duration: " + getDuration() + ", Customer: " + getCustomer() + ", Medical Expenses: " + medicalExpense + "." );
		return ( super.toString() + ", Medical Expenses: " + medicalExpense + "." );
	}
	
	//method to calculate cost
	public double HealthInsuranceCost() {
		int b = 0;
		//check if sex is male
		if (getCustomer().getSex().equals("male")) {
			b = 50;
		}	
		return (  insuranceCost() + 7*getCustomer().getYearOfBirth() + 0.025*getMedicalExpense() + b);
	}

}
