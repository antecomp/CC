import java.util.Scanner;
import java.util.*;
public class Fibo {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				ArrayList<Integer> nList = new ArrayList<Integer>();
				// Add starting values to prevent index out of bounds
				nList.add(0);
				nList.add(1);
				int inum = input.nextInt();
				for(int i = 2; i < inum; i++) {
					nList.add(nList.get(i - 1) + nList.get(i - 2));
				}
			//	System.out.println("Debug: List = " + nList.toString());
				System.out.println(inum + " = " + nList.get(inum - 1)); // need -1 to account for 0-indexed.
			}
		}
	}
}
