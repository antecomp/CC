import java.util.*;
public class dotdotdot {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int testNumber = Integer.parseInt(input.nextLine());
            for (int i=0; i<testNumber; i++) {
                String in = input.nextLine();
                String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                int t=0;
                for (int j=0; j<in.length();j++) {
                    String letter = in.substring(j,j+1);
                    for (int o=0; o<alphabet.length; o++) {
                        if (letter.equals(alphabet[o])){
                            t+=(o+1);
                        }
                    }
                }
                System.out.println(t);
            }
        }
    }
}
