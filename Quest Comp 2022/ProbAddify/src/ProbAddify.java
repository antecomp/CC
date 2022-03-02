import java.util.Scanner;

public class ProbAddify {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for (int count = 0;count<testAmount;count++){

                String two = input.next();

                String[] seperateInput = two.split(" ");

                int numOne = Integer.parseInt(seperateInput[0]);
                int numTwo = Integer.parseInt(seperateInput[1]);

                System.out.println(numOne+numTwo + " " + numTwo*numOne);

            }
        }


    }
}
