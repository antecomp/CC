import java.util.*;
public class Prob00 {

	public static boolean compareHands(char hand, char compareTo){
		boolean rtn = false;
		// agony :)
		switch(hand) {
			case 'R' :
				if(compareTo == 'S') { rtn = true ; }// else false implied :)
				break;                              
			case 'P' :                              
				if(compareTo == 'R') { rtn = true ; }// else false implied :)
				break;                              
			case 'S' :                              
				if(compareTo == 'P') { rtn = true ; }// else false implied :)
				break;
		}
		if(hand == compareTo) {return false;}
		return rtn;
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				char[] plays = input.nextLine().replaceAll(" ","").toCharArray();
				
				ArrayList<Character> remaining = new ArrayList<Character>();
				ArrayList<Character> loosers = new ArrayList<Character>();

				for(int i = 0; i < plays.length; i++ ) {
					for(int j = 0; j < plays.length; j++) {
						if(i == j) continue; // skip itself to prevent a false loose.
						// System.out.println("Comparing " + plays[i] + " With " + plays[j]);
						if(compareHands(plays[i], plays[j]) && !remaining.contains(plays[i])) {
							// System.out.println("Adding " + plays[i]);
							remaining.add(plays[i]); // Only consider the plays that ever had a chance of winning
						}
						if(!compareHands(plays[i], plays[j])){// if the play ever looses (or has a tie)
							// System.out.println("Removing " + plays[i]);
							// if(remaining.indexOf(plays[i]) != -1) remaining.remove(remaining.indexOf(plays[i])); // Handled by removeAll(loosers);
							loosers.add(plays[i]);
						}	
					}
				}
				remaining.removeAll(loosers);
				// Winner will be a single remaining value in remaining
				//System.out.println(remaining.toString());
				switch((remaining.size() == 1) ? remaining.get(0) : 'N') {
					case 'N' :
						System.out.println("NO WINNER");
						break;
					case 'R' :
						System.out.println("ROCK");
						break;
					case 'P' :
						System.out.println("PAPER");
						break;
					case 'S' :
						System.out.println("SCISSORS");
						break;
				}

			}
		}
	}
}
