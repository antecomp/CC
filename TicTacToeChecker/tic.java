import java.util.Scanner;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				char[] vals = input.nextLine().toCharArray();
				int[][] winindex = {
					{0,1,2},
					{3,4,5},
					{6,7,8},
					{0,3,6},
					{1,4,7},
					{2,5,8},
					{0,4,8},
					{2,4,6},
				};

				String winner = "";

				for(int pos[] : winindex) {
					if(
							vals[pos[0]] == 'X'
							&&	vals[pos[1]] == 'X'	
							&&	vals[pos[2]] == 'X'	
					  ) {
						winner = "X WINS";
						break;
					} else if(
							vals[pos[0]] == 'O'
							&&	vals[pos[1]] == 'O'	
							&&	vals[pos[2]] == 'O'	
							) {
						winner = "O WINS";
						break;
					} else {
						winner = "TIE";
					}
				}

				System.out.println(String.valueOf(vals) + " = " + winner);

			}
		}
	}
}
