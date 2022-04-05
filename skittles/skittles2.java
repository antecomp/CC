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

					int X = 5 - unique.length();
					counts[X]++;
					GroupStrings[X] = unique;
					
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
