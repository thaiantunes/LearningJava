package first_steps;

public class If {
	
	public static void main(String[] args) {
		int age = 17;
		int numberOfPeople = 1;
		if (age >= 18) {
			System.out.println("you are above 18");
			System.out.println("welcome");
		} else {
			if(numberOfPeople >=2) {
				System.out.println("you are not 18, but is allowed in");
			} else {
			System.out.println("you are not allowed in");
			}
		}
	}
}
