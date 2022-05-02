import java.util.Arrays;
import java.util.Scanner;

public class emrgupt {

	public static boolean ArrayContainsName(String[][] records, String target) {
		for(String[] record : records) {
			if(record[0].equals(target)) {
				return true;
			}
		}
		return false;
	}

	public static String[] recordMatch(String[][] oldRecs, String name) {
		for(String[] record : oldRecs) {
			if(record[0].equals(name)) {
				//System.out.print("recMatch is " + Arrays.toString(record));
				return record;
			}
		}
		return null;
	}


	// see what values changed between the two arrays
	/* public static String[] getChangedValues(String[][] oldRecords, String[][] newRecords, String skipNames) {

		// for each valye in newRecords...
		// if its not a name to skip...
		   for(String[] record : newRecords) {
			   if(!skipNames.contains(record[0])) {

			   }
		   }
		
	} */

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String screaming = input.nextLine();
				int numoldRecs = Integer.parseInt(screaming.split(" ")[0]);
				int numnewRecs = Integer.parseInt(screaming.split(" ")[1]);
				// int numnewRecs = input.nextInt();
				//input.next();

				String[][] oldRecords = new String[numoldRecs][3];
				String[][] newRecords = new String[numnewRecs][3];

				for(int i = 0; i < numoldRecs; i++) {
					oldRecords[i] = input.nextLine().split(",");
				}

				for(int i = 0; i < numnewRecs; i++) {
					newRecords[i] = input.nextLine().split(",");
				}

				/* System.out.println(
					Arrays.deepToString(oldRecords)
				);

				System.out.println(
					Arrays.deepToString(newRecords)
				); */


				String namestoskip = "";

				// find deleted
				for(String[] record : oldRecords) {
					if(!ArrayContainsName(newRecords, record[0])) {
						System.out.println(record[0] + " DELETED");
						namestoskip += record[0] + ",";

					}
				}

				// find created
				for(String[] record : newRecords) {
					if(!ArrayContainsName(oldRecords, record[0])) {
						System.out.println(record[0] + " CREATED");
						namestoskip += record[0] + ",";
					}
				}


				// find changes
				for(String[] record : newRecords) {
					if(ArrayContainsName(oldRecords, record[0])) {
						String[] recToC = recordMatch(oldRecords, record[0]);
						//System.out.println("Comparing " + Arrays.toString(recToC) + " to " + Arrays.toString(record));

						if(!recToC[1].equals(record[1]) && !recToC[2].equals(record[2])) {
							System.out.println(record[0] + " UPDATED BOTH");
							continue;
						}

						if(!recToC[1].equals(record[1])) {
							System.out.println(record[0] + " UPDATED PHONE NUMBER");
						}
						if(!recToC[2].equals(record[2])) {
							System.out.println(record[0] + " UPDATED ADDRESS");
						}
					}
				}

				

			}
		}
	}
}
