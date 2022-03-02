import java.util.Scanner;

public class ProbFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (input) {

            int testAmount = Integer.parseInt(input.nextLine());

            for (int i = 0; i < testAmount; i++) {

                int testNum = Integer.parseInt(input.nextLine());

                long sum = 0;
                long num1 =0;
                long num2 =1;


                for(;;){

                    sum = num1+num2;
                    num1 = num2;
                    num2= sum;

                    
                    if(sum==testNum|| testNum==0){

                        System.out.println("TRUE");
                        break;
                    }

                    if(sum>testNum){
                        System.out.println("FALSE");
                        break;

                    }


                }



            }


        }


    }


}
