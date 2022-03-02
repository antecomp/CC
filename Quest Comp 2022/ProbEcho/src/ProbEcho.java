import java.util.Scanner;
public class ProbEcho {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for(int i =0; i<testAmount; i++){


                String output = input.nextLine();
                System.out.println(output);
                System.out.println(output);



            }






        }





    }

}
