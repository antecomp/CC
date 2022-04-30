import java.util.Scanner;

public class timecards {

	public static int calcTime(String[] times) {

		int Rhours = 0;
		int Rmins = 0;

		for(String time : times) {
			String[] timeSplit = time.split(":");
			Rhours += Integer.parseInt(timeSplit[0]);
			Rmins += Integer.parseInt(timeSplit[1]);
		}

		Rhours += Rmins / 60;
		Rmins = Rmins % 60;
	}


	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				timecard = input.nextLine();
				String[] cardArry = timecard.split(",");

				String rtn = cardArry[0] + "=";

				rtn += calcTime(Arrays.copyOfRange(cardArry, 1, cardArry.length));

			}
		}
	}
}
