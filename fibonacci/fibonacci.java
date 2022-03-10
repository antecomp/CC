import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in);) {
            int testNumber = Integer.parseInt(input.nextLine());
            for (int i=0; i<testNumber; i++) {
                int testCase = Integer.parseInt(input.nextLine());
                long[] fibonacci = new long[90];
                long x=0;
                long y=1;
                long z=1;
                for (int j=0; j<90; j=j+3) {
                    fibonacci[j] = x;
                    fibonacci[j+1] = y;
                    fibonacci[j+2] = z;
                    x=y+z;
                    y=z+x;
                    z=y+x;
                }
                System.out.println(testCase + " = " + fibonacci[testCase-1]);
            }
        }
    }
}
