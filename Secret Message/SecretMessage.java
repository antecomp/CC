import java.util.*;

public class SecretMessage {

	static int nextPerfectSquare(int N) {
		int nextN = (int) Math.floor(Math.sqrt(N)) + 1;
		return nextN * nextN;
	}
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String inputString = input.nextLine();
				int matrixSize = nextPerfectSquare(inputString.length());
				int matrixDims = (int)Math.sqrt(matrixSize);

				char[][] matrix =  new char[matrixDims][matrixDims];

				
				

				int k = 0;
				for(int i = 0; i < matrixDims; i++) {
					for(int j = 0; j < matrixDims; j++) {
						if(k < inputString.length()) {
							matrix[i][j] = inputString.charAt(k);
						} else {
							matrix[i][j] = '*';
						}
						k++;
					}
				}

				System.out.println("Original:");
				System.out.println(Arrays.deepToString(matrix).replaceAll("],", "]\n"));
				System.out.println(); 

				for(int row = 0; row < matrixDims; row++) { //transpose
					for(int col = row; col < matrixDims; col++) {
						char tmp = matrix[row][col];
						matrix[row][col] = matrix[col][row];
						matrix[col][row] = tmp;
					}
				}

				System.out.println("Tranposed:");
				System.out.println(Arrays.deepToString(matrix).replaceAll("],", "]\n"));
				System.out.println(); 

				//. god is dead
				for (char[] row : matrix) {
					for (int i = 0; i < row.length / 2; i++) {
						char temp = row[i];
						row[i] = row[row.length - i - 1];
						row[row.length - i - 1] = temp;
					}
				}
				System.out.println("Rotated:");
				System.out.println(Arrays.deepToString(matrix).replaceAll("],", "]\n"));
				System.out.println(); 

				System.out.println(Arrays.deepToString(matrix).replaceAll("\\[|\\]|,|\\s|\\*", ""));

			}
		}
	}
}
