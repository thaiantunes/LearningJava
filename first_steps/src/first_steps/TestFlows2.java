package first_steps;

public class TestFlows2 {
	public static void main(String[] args) {
		for(int line = 1; line <= 10; line++) {
			for(int column = 0; column<=10; column++) {
				if(column > line) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
