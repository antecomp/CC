import java.util.Scanner;
import java.math.BigInteger;
public class sand {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				BigInteger sC = new BigInteger("0"); 
				int tC = Integer.parseInt(input.nextLine());
				for(int teams = 0; teams < tC; teams++) {
					BigInteger a = new BigInteger(input.nextLine());
					sC = sC.add(a);
				}
				System.out.println(sC.toString());
			}
		}
	}
}
