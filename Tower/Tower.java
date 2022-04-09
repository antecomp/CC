package Tower;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class Tower {
	public static void main(String[] args) {	
		try (Scanner input = new Scanner(System.in)){
			//int numBricks = Integer.parseInt(input.nextLine());
			input.nextLine(); // we dont need the number of bricks
			int towers = 1;
			String sizesRaw = input.nextLine();
			int[] sizes = Stream.of(sizesRaw.split(" ")).mapToInt(Integer::parseInt).toArray();
			System.err.println(Arrays.toString(sizes));
			for(int i = 1; i < sizes.length; i++) {
				if(sizes[i] > sizes[i -1]) {
					towers++;
				}
			}
			System.out.println(towers);

		}
	}
}
