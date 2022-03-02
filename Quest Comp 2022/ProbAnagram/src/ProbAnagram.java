import java.util.Arrays;
import java.util.Scanner;

public class ProbAnagram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String str = input.nextLine();
                String[] anagram = str.split("\\|");

                if(anagram[0].equals(anagram[1])){
                    System.out.println(str + " = NOT AN ANAGRAM");
                }else{
                    char[] char1 = anagram[0].toCharArray();
                    char[] char2 = anagram[1].toCharArray();
                    Arrays.sort(char1);
                    Arrays.sort(char2);
                    String anagram1 = new String(char1);
                    String anagram2 = new String(char2);

                    if(anagram1.equals(anagram2)){
                        System.out.println(str + " = ANAGRAM");
                    }else{
                        System.out.println(str + " = NOT AN ANAGRAM");
                    }
                }
            }
        }
    }
}
