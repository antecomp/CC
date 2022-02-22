import java.util.Scanner;
import java.math.BigInteger;
public class factr {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				int end = input.nextInt();
				BigInteger rtn = new BigInteger(Integer.toString(end));
				for(int i = 1; i < end; i++){
					rtn = rtn.multiply(BigInteger.valueOf(i));
				}
				System.out.println(rtn);
			}
		}
	}
}
