import java.util.Scanner;
public class Prob00 {
	public static String F(double x) { // for rounding half-up
		return String.format("%.1f", x);
	}
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {

				double a = input.nextInt();
				char opr = input.next().charAt(0);
				double b = input.nextInt();
				switch(opr) {
					case '+': System.out.println(F(a + b) + " " + F(a +b));
							  break;
					case '-': System.out.println(F(a - b) + " " + F(b - a));
							  break;
					case '*': System.out.println(F(a * b) + " " + F(a * b));
							  break;
					case '/': System.out.println(F(a / b) + " " + F(b / a));
							  break;
					default: continue;
				}

			}
		}
	}
}
