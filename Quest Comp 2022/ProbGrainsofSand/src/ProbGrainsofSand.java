import  java.util.Scanner;
import java.math.BigInteger;

public class ProbGrainsofSand {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    try(input){

        int testAmount = Integer.parseInt(input.nextLine());


        for(int i = 0; i<testAmount; i++){

            int linesOfSand = Integer.parseInt(input.nextLine());

            BigInteger[] amountOfInputs = new BigInteger[linesOfSand];

            for(int j = 0; j<linesOfSand; j++){
                amountOfInputs[j] =new BigInteger(input.nextLine());


            }

           BigInteger sum = new BigInteger("0");

            for(int q = 0; q<amountOfInputs.length;q++){

                sum = sum.add(amountOfInputs[q]);


            }
            System.out.println(sum);

        }








    }





    }
}
