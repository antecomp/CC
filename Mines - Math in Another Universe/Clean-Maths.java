import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Maths3 {

	public static String ACalc(String opp) { // This feels like a crime
		String[] opArr = opp.split(" ");
		return Integer.toString(
				(opp.contains("+")) ?
				Integer.parseInt(opArr[0]) + Integer.parseInt(opArr[2]) : Integer.parseInt(opArr[0]) - Integer.parseInt(opArr[2])
		);
	}

	public static String MCalc(String opp) { // Brevity is the soul of java stupidity
		String[] opArr = opp.split(" ");
		return Integer.toString(
				(opp.contains("*")) ?
				Integer.parseInt(opArr[0]) * Integer.parseInt(opArr[2]) : Integer.parseInt(opArr[0]) / Integer.parseInt(opArr[2])
		);
	}


	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				// Addition and subtraction are done first followed by multiplication and division. 
				// Addition and subtraction is still performed left to right, as is multiplication and division.
				//

				String equation = input.nextLine();

				boolean extracting = true;

				while(extracting) { // Continue until every operation is finished


					// Start off marking false, will only change back to true if an operation occurs.
					extracting = false;


					// Addition/Subtraction
					Pattern addSubReg = Pattern.compile("-?\\d+\\s(\\-|\\+)\\s-?\\d+"); // Compile regex for ±digit ± ±digit
					Matcher addSubMatch = addSubReg.matcher(equation);			  // Class that contains search results for regex.

					if(addSubMatch.find()) {
						String addMatch = addSubMatch.group(0); 

						System.out.println("AddSub At : " + addMatch);

						String result = ACalc(addMatch);

						equation = equation.replace(addMatch, result);

						System.out.println(equation);

						extracting = true;

						continue; // complete all these operations before proceeding to mult/div

					}

					
					// Multipication/Division
					Pattern MultSubReg = Pattern.compile("-?\\d+\\s(\\*|\\/)\\s\\-?\\d+");
					Matcher MultSubMatch = MultSubReg.matcher(equation);

					if(MultSubMatch.find()) {
						String MultMatch = MultSubMatch.group(0);

						System.out.println("MultDiv At : " + MultMatch);

						String result = MCalc(MultMatch);

						equation = equation.replace(MultMatch, result);

						System.out.println(equation);

						extracting = true;

						continue;

					}

				}

				System.out.println("Calculation Completed, Result = " + equation);

			}
		}
	}
}
