import java.util.Scanner;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				char[] chrs = input.nextLine().toCharArray();
				int num = 0;
				for (char ch : chrs) {
					num += (int)ch - 96; // ASCII for lower case starts at 97.
				}
				System.out.println(num);
			}
		}
	}
}
