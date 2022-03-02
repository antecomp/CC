import java.util.Scanner;

public class ProbAEIOU {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());


            for(int count = 0; count<testAmount; count++){

                String sentence = input.nextLine();

                int numCount = 0;

                for (int i =0; i<sentence.length(); i++){

                    if ('a' == sentence.charAt(i) ||'e' == sentence.charAt(i) ||'i' == sentence.charAt(i) ||'o' == sentence.charAt(i) ||'u' == sentence.charAt(i)){

                        numCount++;

                    }


                }



                System.out.println(numCount);
            }


        }


    }

}
