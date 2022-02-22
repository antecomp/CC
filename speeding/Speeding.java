import java.util.Scanner;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				// System.out.println(input.nextLine());
				int speed = input.nextInt();
				if(input.nextBoolean()) {
					speed -= 5;
				}

				if(speed > 60){
					System.out.println((speed > 80) ? "big ticket" : "small ticket");
					continue;
				}
				System.out.println("no ticket");
			}
		}
	}
}
