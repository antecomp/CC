import java.util.Scanner;
public class sDrive {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Actual code starts here
				/* expected input: (values will be rounded to two decimal places.)
				 * Each test case will include a single line
					 containing two numbers separated by a colon:
				   A decimal value V, between 0 and 200 inclusive - speed (m/s)
				   A decimal value X, between 1 and 400 inclusive - obstacle distance (meters)
				   of the car (in m) */
				// System.out.println(input.nextLine());
					
				// Seperate out the input into two seperate variables to use.
				String carData = input.nextLine();
				double speed = Double.parseDouble(carData.substring(0, carData.indexOf(":")));
				double distance = Double.parseDouble(carData.substring(carData.indexOf(":") + 1));

				/* test data parsing is correct
				System.out.println("speed: " + speed);
				System.out.println("distance: " + distance);
				*/

				if(distance - speed <= 0) 
				{
					System.out.println("SWERVE");
					continue;
				}

				if(distance - (speed * 5) <= 0)
				{
					System.out.println("BRAKE");
					continue;
				}

				System.out.println("SAFE");	
			}
		}
	}
}
