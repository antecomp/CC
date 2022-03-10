import java.util.*;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				String posLine = input.nextLine();
				String output = "";
				ArrayList<Character> positions = new ArrayList<Character>();
				for (char c : posLine.toCharArray()) {
					if(c != ' ') {
						positions.add(c);
						if(c == 'M') output += (positions.lastIndexOf(c) + 1) + " ";
					}
				}
				System.out.println(output.trim()); // tfw wrong answer for trailing spaces, make sure you have trim :)):):):)::):))
			}
		}
	}
}
