import java.util.*;
public class Prob00 {

	public static boolean validate(String in) {
		// I LOVE REGEX SO MUCH!!!!111111one!!!11 WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		// matches takes a regex expression and returns true if the input has match
		// This regex expressions looks for digits as well as - and . for negatives and floats
		return in.matches("-?\\d+(\\.\\d+)?");
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String i1 = input.next();
				String i2 = input.next();
				if(!validate(i1)) {
					System.out.println("Invalid Dividend");
					continue;
				}
				if(!validate(i2)) {
					System.out.println("Invalid Divisor");
					continue;
				}
				double n1 = Double.parseDouble(i1);
				double n2 = Double.parseDouble(i2);
				if(n2 == 0) {
					System.out.println("Divide By Zero");
					continue;
				}
				System.out.println(String.format("%.1f", n1 / n2));
			}
		}
	}
}
