
public class Life extends Insurance {
	
	/*Extending Insurance class and further described by:
		the amount the customer decides to invest.
		Getters/setters
		toString()
		Cost calculation : 100 euro plus 5 for every Customer’s year and 5% of the invested amount
		Each  generated Life object should be stored in an array  (length=10).
	 */
	
	
	private double amountInvest;
	static Life[] lifeInsuranceDatabase = new Life[10];
	
	//constructor
	Life ( String duration, Customer customer, double amountInvest ) {
		super (duration, customer );
		this.amountInvest = amountInvest;
	}
		
	//getter
	public double getAmountInvest() {
		return amountInvest;
	}
	
	//setter
	public void setAmountInvest(double amountInvest) {
		this.amountInvest = amountInvest;
	}
	
	//method toString
	@Override
	public String toString() {
		//return ("Insurance's Code: " + getInsuranceCode() + ", Duration: " + getDuration() + ", Customer: " + getCustomer() + ", Amount Invested: " + amountInvest +"." );
		return ( super.toString() + ", Amount Invested: " + amountInvest +".");
	}
	
	//method to calculate cost
	public double lifeInsuranceCost() {
		return (  insuranceCost() + 5*( 2017 - getCustomer().getYearOfBirth() ) +0.05*amountInvest);
	}
}
