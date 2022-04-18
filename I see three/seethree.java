import java.util.*;
public class seethree {

	public static boolean checkTrips(String entireString, String lookfor) {
		// System.err.println("Checking..." + lookfor);
		// System.err.println(Arrays.toString(entireString.split(lookfor)));
		// System.err.println(entireString.split(lookfor, -1).length);
		return ((entireString.split(lookfor, -1).length - 1) == 3);
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String nextLine = input.nextLine();
				boolean skip = false;
				for(String ch : nextLine.split(" ")) {
					if(checkTrips(nextLine, ch)) {
						System.out.println("TRUE");
						skip = true;
						break;
					}
				}
				if(!skip) System.out.println("FALSE");
			}
		}
	}
}
