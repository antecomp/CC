import java.util.Scanner;

public class CalliFrame { // Time: 18 Minutes - Marked Wrong But Provided Test Cases Work. Not sure what the issue is.
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				
				String inputText = input.nextLine();
				int sLength = inputText.length();

				String output = "";

				// Gaurd Clause - Not a Calliframe
				if(
					!inputText.matches("[A-Za-z]+") || // forgot the + :)
					(sLength < 5) ||
					(sLength > 32)
				) {
					System.out.println("Not a Calliframe");
					continue;
				}

				String reversed = "";
				for(int i = sLength -1; i >= 0; i--) {
					reversed += inputText.charAt(i);
				}

				//System.out.println(reversed);

				String spaces = "";
				for(int i = 0; i < sLength -2; i++) { // two less spaces
					spaces += " ";
				}
				
				output += inputText + "\n";

				for(int i = 1; i < sLength - 2; i++) {
					output += inputText.charAt(i) + spaces + reversed.charAt(i) + "\n";
				}

				output += reversed;

				System.out.println(output);
			
			}
		}
	}	
}
