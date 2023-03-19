package tek.capstone.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {

	public static void main(String [] args) {
		
		
		
		
		System.out.println(data("state"));
		System.out.println(DataFekerNotRandom("firstName"));
		System.out.println(DataFekerNotRandom("lastName"));
		System.out.println(DataFekerNotRandom("fullName"));
		
	}
		


		public static String data(String input) {
			Faker faker = new Faker(); // Declare object of class faker
			String output = "";// provide different values
		
			if (input.equals("firstName")) {
				output = faker.name().firstName();
			}else if (input.equals("lastName")) {
				output = faker.name().lastName();
			}else if (input.equals("fullName")) {
				output = faker.name().fullName();
			}else if (input.equals("email")) {
//				output = faker.name().firstName() + "." + faker.name().lastName() + "@tekschool.us";  
				output = faker.expression("#{letterify '????.????@tekschool.us'}"); // email accept less then 30 carechtar then we can do data conditioning
			}else if (input.equals("phoneNumber")) {
				output = faker.phoneNumber().cellPhone();
			}else if (input.equals("streetAddress")) {
				output = faker.address().streetName();
			}else if( input.equals("city")) {
				output = faker.address().city();
			}else if (input.equals("state")) {
				output = faker.address().state();
			}else if (input.equals("zipCode")) {
				output = faker.address().zipCode();
			}else if (input.equals("country")) {
				output = "United States";
			}else if(input.equals("apt")) {
				output = faker.address().secondaryAddress();
			}
			return output;	
		}
		
		
		// we can write method for each of them in out common utility 
	//////////////////////////////////////////////////////////////////////////	
		
		

		static String firstName = "";    // for not getting random data
		static String lastName = "";           // 
		
		public static String DataFekerNotRandom(String input) {
			Faker faker = new Faker();
			String output = "";
			
			if (input.equals("firstName")) {
				firstName = faker.name().firstName();
				output = firstName;
			}else if(input.equals("lastName")) {
				lastName = faker.name().lastName();
				output = lastName;
			}else if(input.equals("fullName")) {
				output = firstName +" "+ lastName;
			}
			
			return output;
		}
		
		
	
	
		
		
		
		
		
		
	
	
}
