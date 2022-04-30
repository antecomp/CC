import java.util.Scanner;
import java.util.*;

public class timecards {

	public static int[] calcTime(String[] times) {

		int Rhours = 0;
		int Rmins = 0;

		for(String time : times) {
			String[] timeSplit = time.split(":");
			Rhours += Integer.parseInt(timeSplit[0]);
			Rmins += Integer.parseInt(timeSplit[1]);
		}

		Rhours += Rmins / 60;
		Rmins = Rmins % 60;

		return new int[] { Rhours, Rmins };
	}


	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String timecard = input.nextLine();
				String[] cardArry = timecard.split(",");

				//System.out.println(Arrays.toString(cardArry));

				String rtn = cardArry[0] + "=";

				int numHours = calcTime(
					Arrays.copyOfRange(cardArry, 1, cardArry.length)
					)[0];
				
				if (numHours != 0) {
					rtn += (numHours == 1) ? numHours + " hour" : numHours + " hours";
				}

				rtn += " ";

				int numMins = calcTime(
					Arrays.copyOfRange(cardArry, 1, cardArry.length)
				)[1];

				if(numMins != 0) {
					rtn += (numMins == 1) ? numMins + " minute" : numMins + " minutes";
				}

				System.out.println(rtn.trim());
			}
		}
	}
}
