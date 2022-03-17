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

				for(int i = 0; i <= iRows; i++) {
					String thisRow = input.nextLine();
					// use string replace ,, with ,<placeholder>, to have a value that can be turned back into nothing at the end.
					//thisRow = thisRow.replace(",,", ",X,");
					// Split the string into an array at commas
					String[] rowArray = thisRow.split(",");
					System.out.println(Arrays.toString(rowArray));
					// Convert column to an array of ints to be added to each row in this loop
				}
			}
		}
	}
}
