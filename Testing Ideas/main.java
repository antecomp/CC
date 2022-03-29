import java.util.*;
public class main {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				int test = input.nextInt();
				System.out.println(test); // Next Int Does Capture Negatives :)
			}
		}
	}
}
