import java.util.Scanner;
public class InsuranceSystemMenu {
	
	//variable
	static boolean quitMenu = false;
	static boolean caseTwoLock = false;
	static String proxy;
	static int proxySec;
	static double proxyDouble;
	static Scanner input = new Scanner(System.in);
	static Customer proxy3;
	static Health health;
	static Life life;

	public static void main(String[] args) {
		
		//create customer data
		Customer customer1 = new Customer("A", 1986 , "male" );
		Customer customer2 = new Customer("B", 1966 , "male" );
		Customer customer3 = new Customer("C", 1987 , "male" );
		Customer customer4 = new Customer("D", 1977 , "male" );
		Customer customer5 = new Customer("E", 1945 , "male" );
		Customer customer6 = new Customer("F", 1910 , "female" );
		Customer customer7 = new Customer("G", 1999 , "female" );
		Customer customer8 = new Customer("H", 2010 , "female" );
		Customer customer9 = new Customer("I", 2008 , "female" );
		Customer customer10 = new Customer("J", 1906 , "female" );
		
		//create insurance data
		Health health1 = new Health("10", customer1, 457);
		Life life1 = new Life("11", customer2, 1007);
		Health health2 = new Health("12", customer3, 677);
		Life life2 = new Life("13", customer4, 457);
		Health health3 = new Health("16", customer5, 487);
		Life life3 = new Life("14", customer6, 45907);
		Health health4 = new Health("18", customer7, 4888);
		Life life4 = new Life("15", customer8, 447);
		Health health5 = new Health("19", customer9, 4677);
		Life life5 = new Life("16", customer10, 4677);
		
		
		System.out.println("                Welcome               ");
		//loop generating the main menu
		while (quitMenu == false) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("**************MENU*******************");
			System.out.println();
			System.out.println();
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			System.out.println("4. Create new Insurance");
			System.out.println("5. Quit");
			String proxy = input.nextLine();
			
			//input for menu choices with validator to ensure choice can be only 1,2,3,4,5
			while (Validator.validator(proxy) == false) {
				System.out.println("Valid inputs: 1, 2, 3, 4, 5 !!! ");
				System.out.println("Please try again... ");
				proxy = input.nextLine();
			}
			//Switch statement for the 5 available menu paths
			switch (proxy) {
			case "1" :
				System.out.println("-------------------------All Insurances------------------------------");
				Insurance.printAllInsurance ();
				break;
			case "2" :
				do {
					System.out.println("Please enter customer code for the desired insurance");
					proxy = input.nextLine();
					Validator.validator(proxy);
				} while (Validator.validator(proxy) == false);
				proxySec = Integer.parseInt(proxy);
				Insurance.printInsuranceFromCustomerCode(proxySec);
				break;
			case "3" :
				do {
					System.out.println("Please enter insurance code for the desired insurance");
					proxy = input.nextLine();
					Validator.validator(proxy);
				} while (Validator.validator(proxy) == false);
				proxySec = Integer.parseInt(proxy);
				Insurance.printInsuranceFromInsuranceCode(proxySec);
				break;
			case "4" :
				//local variables to be used for input dummies
				String proxy1;
				String proxy2;
				//create the customer object ( to be used for insurance object)
				System.out.println("Please enter the customers name:");
				proxy = input.nextLine();
				do {
				System.out.println("Please enter the year of his birth:");
				proxy1 = input.nextLine();
				Validator.birthValidator(proxy1);
				} while (Validator.birthValidator(proxy1) == false);
				proxySec = Integer.parseInt(proxy1);
				System.out.println("Please enter customer's sex:");
				proxy2 = input.nextLine();
				proxy3 = new Customer( proxy , proxySec , proxy2 );
				System.out.println(proxy3.toString());
				//ask the user if he wants to create a life or health insurance and take the input
				System.out.println("what kind of insurance you wanna create;");
				do {
					System.out.println("1. Health insurance");
					System.out.println("2. Life insurance");
					proxy = input.nextLine();
					Validator.validator(proxy);
				} while (Validator.validator(proxy) == false && proxy != "1" && proxy != "2" );
				switch (proxy){
				case "1" :
					System.out.println("Please enter duration of the insurance:");
					proxy1 = input.nextLine();
					do {
						System.out.println("Please enter medical expenses for the customer:");
						proxy = input.nextLine();
					}while (Validator.validatorDouble(proxy) == false);
					proxyDouble = Double.parseDouble(proxy);
					health = new Health( proxy1 , proxy3, proxyDouble);
					System.out.println(health.toString());
					break;
				case "2" :
					System.out.println("Please enter duration of the insurance:");
					proxy1 = input.nextLine();
					do {
						System.out.println("Please enter amount invested for the customer:");
						proxy = input.nextLine();
					}while (Validator.validatorDouble(proxy) == false);
					proxyDouble = Double.parseDouble(proxy);
					life = new Life( proxy1 , proxy3, proxyDouble);
					break;
				}
				break;				
			case "5" :
				System.out.println("Thank you for using my product. Have a great day !!!");
				quitMenu = true;
				break;		
			}
			
		}

	}

}
