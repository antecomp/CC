import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Codebreaker {
    public static double chance (int length, double amount)
    {
        amount /= length;
        return amount*100;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                DecimalFormat df = new DecimalFormat("#.##");
                int lines = Integer.parseInt(input.nextLine());
                String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                int mapLength = 0;
                Map<Character, Double> map = new HashMap<>();

                for(int i = 0; i < lines; i++) {
                    String sentence = input.nextLine().replaceAll("\\p{Punct}|\\s+", "").replaceAll("\\’","");
                    sentence = sentence.toUpperCase();
                    System.out.println(sentence);
                    mapLength += sentence.length();
                    for (char s : sentence.toCharArray()) {
                        if(map.containsKey(s)==false)map.put(s,0.0);
                        map.put(s, map.get(s) + 1.0);
//                    System.out.println(s);
                    }
                }
//                System.out.println("MapLength: "+mapLength);
                for (char s : alpha.toCharArray()) {
//                    System.out.println("There are "+map.get(s)+" "+s);
                    map.put(s, chance(mapLength, map.get(s)));
                }
                for (char s : alpha.toCharArray()) {
                    String hold = df.format(map.get(s)) + "%";
                    System.out.println(s + ": " + hold);
                }
            }
        }
    }
}