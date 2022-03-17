import java.util.*;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				int iRows = input.nextInt();
				int iCols = input.nextInt();

				int oRows = iCols;
				int oCols = iRows;

				String[][] inputArray = new String[iRows][iCols];

				String[][] output = new String[oRows][oCols];


				String thisRow = input.nextLine(); // I have absolutely no idea why I need it declared outside the loop like this but it worked
				// Parse each row of stdin for the 2d input array
				for(int i = 0; i < iRows ; i++) {
					thisRow = input.nextLine();
					// Split the string into an array at commas
					// -1 needed to keep the trailing commas --- https://stackoverflow.com/questions/2170557/split-method-of-string-class-does-not-include-trailing-empty-strings
					String[] rowArray = thisRow.split(",",-1);

					inputArray[i] = rowArray;
				}
				// System.out.println(Arrays.deepToString(inputArray));

				for(int row = 0; row < oRows; row++) { // for each column of each row in output, get the corrosponding opposite cords
					for(int col = 0; col < oCols; col++){
						output[row][col] = inputArray[col][row];
					}
				}
				// System.out.println("New " + Arrays.deepToString(output));

				// Print it out in the format lockheed wants
				System.out.print( // yes
						Arrays.deepToString(output)
						.replaceAll("],|]]", "\n")
						.replaceAll("\\[| ", "")
				);

			}
		}
	}
}
