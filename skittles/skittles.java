import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.CharArrayReader;
import java.util.*;

public class skittles {
/* This one took me way to long to finish. */

	public static String findLetters(String in) {
		String[] lookfor = {"R","O","Y","G","P"};
		String out = "";
		for(String check : lookfor) { // Since it finds them in order, the output string will be what they want
			if (in.contains(check)) {
				out += check;
			}
		}
		return out;
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below

				String bag = input.nextLine();

				int[] counts = new int[5];

				String[] GroupStrings = new String[5];

				while(bag.length() > 0) {

					String unique = findLetters(bag);

					switch(unique.length()) {
						case 5:
							counts[0]++;
							GroupStrings[0] = unique;
							break;
						case 4:
							counts[1]++;
							GroupStrings[1] = unique;
							break;
						case 3:
							counts[2]++;
							GroupStrings[2] = unique;
							break;
						case 2:
							counts[3]++;
							GroupStrings[3] = unique;
							break;
						case 1:
							counts[4]++;
							GroupStrings[4] = unique;
							break;
						case 0:
							System.out.print("Something messed up: unique is empty.");
					}
					
					// remove one of each values from unique from bag
					for(char m : unique.toCharArray()) {
						bag = bag.replaceFirst(String.valueOf(m), "");
					}
				}

				for(int i = 0; i < 5; i++) {
					System.out.println(counts[i] + " " + ((GroupStrings[i] == null) ? "" : GroupStrings[i]));
				}


				}


			}
		}
	}	
