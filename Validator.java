import java.util.Scanner;
public class Validator {

	//Class for handling user input
	
	static Scanner input = new Scanner(System.in);
	
	//method for validating that string can be converted to int
	static boolean validator (String proxy) {
		boolean validate = false;
		try {
			int z = Integer.parseInt(proxy);
			validate = true;
		} catch ( NumberFormatException e) {
			validate = false;
		}
		return validate;
	}
	
	//method for validating that user inputs int between 1900 - 2017
		static boolean birthValidator (String proxy) {
			boolean validate = false;
			try {
				int z = Integer.parseInt(proxy);
				if( z <=2017 && z >= 1900) {
				validate = true;
				}
			} catch ( NumberFormatException e) {
				validate = false;
			}
			return validate;
		}
		
		//method for validating that string can be converted to double
		static boolean validatorDouble (String proxy) {
			boolean validate = false;
			try {
				double z = Double.parseDouble(proxy);
				validate = true;
			} catch ( NumberFormatException e) {
				validate = false;
			}
			return validate;
		}
}
	
