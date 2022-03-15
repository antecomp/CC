import java.util.Scanner;

public class Prob00 {

public static boolean winCheck(char[] board, int[] positions, char player) {
	return (
				board[positions[0]] == player
			&	board[positions[1]] == player
			&	board[positions[2]] == player
		   );
}

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
					if(winCheck(vals, pos, 'X')) {
						winner = "X WINS";
						break; // needed to prevent it from using the last testcase as the result
					} else if(winCheck(vals, pos, 'O')) {
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
