import java.util.Scanner;
public class Prob00 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				int width = input.nextInt();
				int rows = input.nextInt();
				input.nextLine();
				String text = input.nextLine();
				String output = "";

				for(int i = 0; i < rows; i++) {
					// Print whatever is left
					if(text.length() <= width) {
						output += text;
						text = ""; // clear remaining text for remainder check at the end.
						break;
					}

					int stopIN = text.lastIndexOf(" ", width); // find splitting point at a space nearest to the width limit.

					if(stopIN < 0) { // skip to won't fit if no appropriate breaking point is found.
						output = "WILL NOT FIT";
						break;
					}

					output += text.substring(0 , stopIN) + "\n"; // Add text up until space closest to the width limit

					text = text.substring(
							stopIN + 1 // +1 to also skip the space :D
							); // Remove this split section from the text.
				}
				
				if(text.length() > 0) { // if there's anything left after splitting, replace output with warning.
					output = "WILL NOT FIT";
				}

				System.out.println(output);

			}
		}
	}
}
