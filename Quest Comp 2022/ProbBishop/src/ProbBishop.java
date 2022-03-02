import java.util.Scanner;
import java.util.Arrays;

public class ProbBishop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for(int i = 0; i<testAmount; i++){

                int[] boardSize = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

                int[] placement = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

                int[] endSQR = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

                int testCase = 0;
                int endCase = 0;

                if (placement[0] % 2 == 0 && placement[1] % 2 == 0 || placement [0] % 2 !=0 && placement[1] % 2!=0){

                    testCase = 1;

                }

                if (placement[0] % 2 == 0 && placement[1] % 2 != 0 || placement [0] % 2 !=0 && placement[1] % 2==0){

                    testCase = 2;


                }

                if (endSQR[0] % 2 == 0 && endSQR[1] % 2 == 0 || endSQR [0] % 2 !=0 && endSQR[1] % 2!=0){

                    endCase = 1;

                }

                if (endSQR[0] % 2 == 0 && endSQR[1] % 2 != 0 || endSQR [0] % 2 !=0 && endSQR[1] % 2==0){

                    endCase = 2;

                }

                if(endCase==testCase){

                    System.out.println("Yes");
                } else{

                    System.out.println("No");
                }

            }

        }

    }
}
