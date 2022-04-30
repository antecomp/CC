import java.util.*;
public class streat {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below
				String rtn = "";
				String line = input.nextLine();
				rtn = line.replaceAll("[^\\w\\s|]", "");
				rtn = rtn.replace("_", "");
				System.out.println(rtn);
			}
		}
	}
}
