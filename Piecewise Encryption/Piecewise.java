import java.util.*;
public class Prob00 {

	public static boolean btwn(int in, int lower, int upper) { // range check method for its alphabetically placement.
		return in >= lower && in <= upper;
	}

	public static int digitSum(int number) {
		int sum = 0;
		int digit = 0;
		while (number > 0) {
			digit = number % 10;
			sum += digit;
			number = number / 10;
		}
		return sum * 8;
	}

	public static int biggestFactor(int number){
		int i, max = 0;
		for(i=1;i<number;i++){
			if(number % i == 0 && i>max) max=i;
		}
		return max * 2;
	}



	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				char[] inputText = input.nextLine().toCharArray();
				ArrayList<Integer> textPostns = new ArrayList<Integer>();
				for (char ch : inputText) { // Convert inputText to int array of positional values
					textPostns.add((int)ch - 64); // ASCII for lower case starts at 97.
				}

				// System.out.println(textPostns.toString()); // Debug: Verify Input

				for(int i = 0; i < textPostns.size(); i++ ){
					if(btwn(textPostns.get(i), 1, 5)) 		 { textPostns.set(i, (textPostns.get(i) + 6) % 26);} 					// A-E
					else if(btwn(textPostns.get(i), 6, 10))  { textPostns.set(i, (textPostns.get(i) * textPostns.get(i)) % 26); } 	// F-J
					else if(btwn(textPostns.get(i), 11, 15)) { textPostns.set(i, (((textPostns.get(i) % 3) * 5) + 1) % 26); } 		// K-O
					
					else if(btwn(textPostns.get(i), 16, 20)) { textPostns.set(i, digitSum(textPostns.get(i)) % 26) ;}	 			// P-T
					else if(btwn(textPostns.get(i), 21, 26)) { textPostns.set(i, biggestFactor(textPostns.get(i)) % 26); }	 		// U-Z
				}
				
				// System.out.println("Shifted Values:" + textPostns.toString()); // Debug: Verify functions

				String output = "";

				for(int pos: textPostns){
					output += (pos == 0) ? 'Z' : (char)(pos + 64); // Z is the only edge case if the calculation result is 0
				}

				System.out.println(output);


			}
		}
	}
}
