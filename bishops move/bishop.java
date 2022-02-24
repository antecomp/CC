import java.util.Scanner;
import java.util.*;
public class Prob00 {

	public static boolean iE(int i) { // isEven is too long of a method name to type out :)
		return(i % 2 == 0);
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				input.useDelimiter("[,\r\n]"); // tell the scanner to use , or new line as delimeter.
			//	int[] board = {input.nextInt(), input.nextInt()};
			//	int[] bishop = {input.nextInt(), input.nextInt()};
			//	int[] loc = {input.nextInt(), input.nextInt()};

			// Represent the cordinate points with a boolean of if those points are odd or even
			boolean[] board = {iE(input.nextInt()), iE(input.nextInt())};
			boolean[] bishop = {iE(input.nextInt()), iE(input.nextInt())};
			boolean[] loc = {iE(input.nextInt()), iE(input.nextInt())};

			// Test input;
			System.out.println(Arrays.toString(board));
			System.out.println(Arrays.toString(bishop));
			System.out.println(Arrays.toString(loc));

			// aodfhdsfk
			System.out.println(
					(board[0] == board[1]) == (loc[0] == loc[1]) // odd/even relationship is the same
			)
			}
		}
	}
}
