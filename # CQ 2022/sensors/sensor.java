import java.util.Arrays;
import java.util.Scanner;

public class sensor {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				int numSensors = Integer.parseInt(input.nextLine());
				String inTXT = input.nextLine();
				String[] sensorsTXT = inTXT.split(" ");

				// convert string array to int array
				int[] sensors = new int[sensorsTXT.length];
				for (int i = 0; i < sensorsTXT.length; i++) {
					sensors[i] = Integer.parseInt(sensorsTXT[i]);
				}

				Arrays.sort(sensors);

				/* System.out.println( 
					Arrays.toString(sensors)
				); */


				for(int i = 0; i < sensors.length -1 ; i++ ) {
					if(sensors[i] != sensors[i+1] - 1) {
						System.out.println(sensors[i] + 1);
					}
				}

			}
		}
	}
}
