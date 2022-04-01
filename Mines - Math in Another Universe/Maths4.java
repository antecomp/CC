import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Maths4 {

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
			for(int testcase = 0; testcase < testCases; testcase++) {
				// Addition and subtraction are done first followed by multiplication and division. 
				// Addition and subtraction is still performed left to right, as is multiplication and division.

				String equation = input.nextLine();

				// Addition/Subtraction
				Matcher ASMatch = Pattern.compile("-?\\d+\\s(\\-|\\+)\\s-?\\d+").matcher(equation);

				while(ASMatch.find()) {
               equation = equation.replace(ASMatch.group(), ACalc(ASMatch.group()));
				}

				// Multipication/Division
            Matcher MDMatch = Pattern.compile("-?\\d+\\s(\\*|\\/)\\s\\-?\\d+").matcher(equation);
            
				while(MDMatch.find()) {
					equation = equation.replace(MDMatch.group(), MCalc(MDMatch.group()));
				}

				System.out.println("Calculation Completed, Result = " + equation);

			}
		}
	}
}
