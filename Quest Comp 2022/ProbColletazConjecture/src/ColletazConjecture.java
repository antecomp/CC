import java.util.Scanner;
public class ColletazConjecture {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());


            for(int count = 0; count<testAmount; count++){

                int inputNum = Integer.parseInt(input.next());

                if( inputNum % 2 == 0 ){

                    inputNum = inputNum / 2;
                    System.out.println(inputNum);
                }




            }






            }



        }





    }



