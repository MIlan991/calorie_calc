import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// USER DATA
		int proffesionActivityFactor;
		String proffesion;
		
		double weight;
		
		int age;
		double ageFactor = 0;
		
		System.out.println("What is your profesion?");
		proffesion = scanner.nextLine();
		
		System.out.println("What is youre weight in kg?");
		weight = scanner.nextDouble();
		
		System.out.println("What is your age?");
		age = scanner.nextInt();
		
		scanner.close();
		
		// PROFFESION ACTIVITY FACTOR
		if(proffesion.equalsIgnoreCase("programmer") || proffesion.equalsIgnoreCase("system administrator") || proffesion.equalsIgnoreCase("manager")) {
			proffesionActivityFactor = 100;
		} else if(proffesion.equalsIgnoreCase("policeman") || proffesion.equalsIgnoreCase("soldier")) {
			proffesionActivityFactor = 200;
		} else if(proffesion.equalsIgnoreCase("sport") || proffesion.equalsIgnoreCase("athlete")) {
			proffesionActivityFactor = 300;
		} else {
			proffesionActivityFactor = 150;
		}
		
		// AGE FACTOR
		if(age >= 0 & age <= 3 ) {
			ageFactor = 1.9;
		} else if(age >= 4 & age <= 10) {
			ageFactor = 1.5;
		} else if(age >= 11 & age <= 18) {
			ageFactor = 1.2;
		} else if(age >= 19 & age <= 26) {
			ageFactor = 1;
		} else if((age >= 27 & age <= 30) || (age >= 50 & age <= 60)) {
			ageFactor = 0.8;
		} else if((age >= 31 & age <= 35) || (age >= 45 & age <= 49)) {
			ageFactor = 0.7;
		} else if((age >= 36 & age <= 44) || age >= 66) {
			ageFactor = 0.6;
		} else {
			ageFactor = 0;
		}
		
		double maxCalorieNumber = weight * proffesionActivityFactor * ageFactor;
		
		
		System.out.println("Proffesion: " + proffesion);
		System.out.println("Activity Factor: " + proffesionActivityFactor);
		System.out.println("Age: " + age);
		System.out.println("Age Factor: " + ageFactor);
		System.out.println("Your maximum calories per day is: " + maxCalorieNumber);
		
		System.out.println("---------------------");
		System.out.println("                                            ");
		System.out.println("End of Code!");
		
	}

}
