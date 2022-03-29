import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Maths {

	public static String ACalc(String opp) { // I hate this
		String[] opArr = opp.split(" ");
		return Integer.toString(
				Integer.parseInt(opArr[0]) + Integer.parseInt(opArr[2])
		);
	}

	public static String SCalc(String opp) { // I hate this
		String[] opArr = opp.split(" ");
		return Integer.toString(
				Integer.parseInt(opArr[0]) - Integer.parseInt(opArr[2])
		);
	}

	public static String MCalc(String opp) { // I hate this
		String[] opArr = opp.split(" ");
		return Integer.toString(
				Integer.parseInt(opArr[0]) * Integer.parseInt(opArr[2])
		);
	}

	public static String DCalc(String opp) { // I hate this
		String[] opArr = opp.split(" ");
		return Integer.toString(
				Integer.parseInt(opArr[0]) / Integer.parseInt(opArr[2])
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


					// Addition
					Pattern addSubReg = Pattern.compile("-?\\d+\\s\\+\\s-?\\d+"); // Compile regex for ±digit + ±digit
					Matcher addSubMatch = addSubReg.matcher(equation);			  // Class that contains search results for regex.

					if(addSubMatch.find()) {
						String addMatch = addSubMatch.group(0); // group 0 adds the entire match

						System.out.println("Addition At : " + addMatch);

						String result = ACalc(addMatch);

						equation = equation.replace(addMatch, result);

						System.out.println(equation);

						extracting = true;

						continue;

					}

					
					// Subtraction
					Pattern SubSubReg = Pattern.compile("-?\\d+\\s\\-\\s-?\\d+");
					Matcher SubSubMatch = SubSubReg.matcher(equation);

					if(SubSubMatch.find()) {
						String SubMatch = SubSubMatch.group(0);

						System.out.println("Subtract At : " + SubMatch);

						String result = SCalc(SubMatch);

						equation = equation.replace(SubMatch, result);

						System.out.println(equation);

						extracting = true;

						continue;

					}


					// Multipication
					Pattern MultSubReg = Pattern.compile("-?\\d+\\s\\*\\s\\-?\\d+");
					Matcher MultSubMatch = MultSubReg.matcher(equation);

					if(MultSubMatch.find()) {
						String MultMatch = MultSubMatch.group(0);

						System.out.println("Mult At : " + MultMatch);

						String result = MCalc(MultMatch);

						equation = equation.replace(MultMatch, result);

						System.out.println(equation);

						extracting = true;

						continue;

					}


					
					// Division
					Pattern DivSubReg = Pattern.compile("-?\\d+\\s\\/\\s\\-?\\d+"); // yes
					Matcher DivSubMatch = DivSubReg.matcher(equation);

					if(DivSubMatch.find()) {
						String DivMatch = DivSubMatch.group(0);

						System.out.println("Div At : " + DivMatch);

						String result = DCalc(DivMatch);

						equation = equation.replace(DivMatch, result);

						System.out.println(equation);

						extracting = true;

						continue;

					}




				}

				System.out.println("Calculation Completed, Result = " + equation);
				// Calculate the result of the matched addition equations - Then replace the matched parts with their results
				// in equation, eg: 5 + 5 / 2  becomes 10 / 2.


			}
		}
	}
}
