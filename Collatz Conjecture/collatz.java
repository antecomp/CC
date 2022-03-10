import java.util.*;
public class collatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try (input) {
            int testNumber = Integer.parseInt(input.nextLine());
            for (int i=0; i < testNumber; i++) {
                int number = Integer.parseInt(input.nextLine());
                int holdNumber = number;
                int j = 0;
                while (number!=1) {
                    if (number%2==0) {
                        number/=2;
                    } else {
                        number*=3;
                        number++;
                    }
                    j++;
                }
                j++;
                System.out.println(holdNumber + ":" + j);
            }
        }
    }
}
