import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (input) {

            int testAmount = Integer.parseInt(input.nextLine());

            for (int i = 0; i < testAmount; i++) {

                int num = Integer.parseInt(input.nextLine());
                long result = 1;

               for(int j = num; j>1; j-=2){
                  result = result*(j*(j-1));

               }

                System.out.println(result);


            }


        }
    }
}