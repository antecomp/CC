import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class Lasrever {

	public static String upperCases(String sentence, Integer[] placements) {
		char[] pain = sentence.toCharArray();
		for(int placement : placements) {
			pain[placement] = Character.toUpperCase(pain[placement]);
		}
		return String.valueOf(pain);
	}

	public static String reverse(String word) {

		ArrayList<Integer> capPlacements = new ArrayList<>();

		String rtn = "";
		for(int i = 0; i < word.length(); i++) {
			if(!Character.toString(word.charAt(i)).matches("[A-Z|a-z]")) 
			{ 
				rtn = rtn + word.charAt(i); } // If not a letter - keep at its proper place
			else {
				if(Character.isUpperCase(word.charAt(i))) { capPlacements.add(i); }
				rtn = word.charAt(i) + rtn;
			}
		}
		
		rtn = rtn.toLowerCase();
		rtn = upperCases(rtn, capPlacements.toArray(new Integer[0]));
		return rtn;
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String print = "";
				String sentance = input.nextLine();
				String split[] = sentance.split(" ");
				for(String word : split) {
					print += reverse(word) + " ";
				}

				System.out.println(print.trim());
				
			}
		}
	}
}
