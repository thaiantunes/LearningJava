package first_steps;

//|| = or
//&& = and
//boolean = true or false

public class Booleans {
	public static void main(String[] args) {
		int age = 12;
		int numberOfPeople = 1;
		boolean accompanied = numberOfPeople >= 2;
		
		System.out.println("accompanied: " + accompanied);
		if (age >= 18 || accompanied) {
			System.out.println("welcome");
		} else {
			System.out.println("you are not allowed in");
		}
	}
}


