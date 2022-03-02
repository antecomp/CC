import java.util.Scanner;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				int n = input.nextInt();
				System.out.print(n);

				int itr = 1;

				while(n > 1) {
					if(n % 2 == 0) {
						n /= 2;
						itr++;
					} else {
						n = 3 * n + 1;
						itr++;
					}
				}

				System.out.println(":" + itr);

			}
		}
	}
}
