import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ISeeThree {
    public static void main(String[] args) throws IOException {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] str = input.nextLine().split(" ");
                Map<String,Integer> map = new HashMap<>();
                for(String s : str)
                {
                    if(map.containsKey(s)!=true) map.put(s,0);
                    map.put(s,map.get(s)+1);
                }
                if(map.containsValue(3)) System.out.println("TRUE");
                else System.out.println("FALSE");
            }
        }
    }
}