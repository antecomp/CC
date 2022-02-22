import java.util.*;
public class Prob00 {

	static double pthg(int a, int b) {
		return(Math.abs(Math.sqrt(a*a + b*b)));
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				ArrayList<int[]> cords = new ArrayList<int[]>();
				// System.out.println(pthg(input.nextInt(), input.nextInt()));
				int numAstr = input.nextInt();
				for(int i = 0; i < numAstr; i++){ // for each asteroid
					int[] cord = {input.nextInt(), input.nextInt()};
					cords.add(cord);
				}
				

				// Test Value Input
			//	for(int i = 0; i < cords.size(); i++)	{
			//		int[] currArr = cords.get(i);
			//		System.out.println("Asteroid at index " + i + " is: " + Arrays.toString(currArr));
			//	}

			//	System.out.println("Sort Time!!!!! =========================");

				Collections.sort(cords, new Comparator<int[]>(){
					public int compare(int[] cordA, int[] cordB) {
						int rtn = (int)Math.signum((10 * pthg(cordA[0], cordA[1]) - 10 * pthg(cordB[0], cordB[1])));
					//	System.out.println("Comparing" + "[" + cordA[0] + "," +  cordA[1] + "]" + " - " + 10 * pthg(cordA[0], cordA[1]));
					//	System.out.println("With" + "[" + cordB[0] + "," +  cordB[1] + "]" + " - " + 10 * pthg(cordB[0], cordB[1]));
					//	System.out.println(rtn);
						return rtn;
					}
				});

				// Test Value Output
			//	for(int i = 0; i < cords.size(); i++)	{
			//		int[] currArr = cords.get(i);
			//		System.out.println("Asteroid at index " + i + " is: " + Arrays.toString(currArr));
			//	}
				for(int i = 0; i < cords.size(); i++)	{
					int[] currArr = cords.get(i);
					System.out.println(currArr[0] + " " + currArr[1]);
				}
//			System.out.println("\n-----------------------------------------------------------------------------\n");
			}
		}
	}
}
