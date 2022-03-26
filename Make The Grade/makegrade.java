import java.util.*;
public class Prob00 {

	public static char calcGrade(double percent) {
		if (percent >= 0.9) { return 'A'; }
		if (percent >= 0.8) { return 'B'; }
		if (percent >= 0.7) { return 'C'; }
		if (percent >= 0.6) { return 'D'; }
		return 'F';
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				int numStudents = input.nextInt();
				char[] key = input.next().toCharArray();

				String name = "";

				for(int i = 0; i < numStudents; i++) {
					name = input.next();
					char[] inputAnswers = input.next().toCharArray();
					
					int numCorrect = 0;

					for(int j = 0; j < key.length; j++) {
						if(inputAnswers[j] == key[j]) numCorrect++;
					}

					//System.out.println(numCorrect);

					double score = (double)numCorrect / key.length;


					System.out.println(
							String.format("%s %.1f%% %c", 
								name,
								score * 100,
								calcGrade(score)
								)
							);

				}
			}
		}
	}
}
