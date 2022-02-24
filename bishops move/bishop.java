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
				input.useDelimiter("[,\r\n]"); // tell the scanner to use , or new line as delimeter.

				int[] board = {input.nextInt(), input.nextInt()};
				boolean[] bishop = {iE(input.nextInt()), iE(input.nextInt())};
//				boolean[] loc = {iE(input.nextInt()), iE(input.nextInt())}; // this one works just fine if the board constraint isn't needed.

				// Condition: New Location fits within constraints of the board. IDK if this is needed, protect against edge-cases.
				// else code just prints no and skips to the next case.
				boolean[] loc = new boolean[2];
				int l1 = input.nextInt();
				int l2 = input.nextInt();
				if(l1 <= board[0] && l2 <= board[1]) {
					loc[0] = iE(l1);
					loc[1] = iE(l2);
				} else { 
					System.out.println("No");
					continue;
				}

				System.out.println(
						((bishop[0] == bishop[1]) == (loc[0] == loc[1])) ? "Yes" : "No" // odd/even relationship is the same
				);
			}
		}
	}
}
