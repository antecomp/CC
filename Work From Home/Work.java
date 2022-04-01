import java.util.*;
public class Work { 
	/* 
		Timed: ~10 Minutes; 
		3 tries before all correct (forgot to type cast WattUsage, leading to output of 0)
		could've been better if I didn't try to be fancy with the print statement initially. 
	*/
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				int WattUsage = input.nextInt();

				int minutes = input.nextInt();

				double cost = input.nextInt() * 0.01;

				// cost is per kilowatt hour

				System.out.println(
					(int)((((double)WattUsage / 1000) * ((double)minutes / 60)) * cost + 0.5)
				);

			}
		}
	}
}
