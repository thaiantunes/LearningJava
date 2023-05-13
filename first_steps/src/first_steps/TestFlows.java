package first_steps;

public class TestFlows {
	public static void main(String[] args) {
		for(int multiplier = 1; multiplier <= 10; multiplier++) {
			for(int i = 0; i<=10; i++) {
				System.out.print(multiplier * i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
