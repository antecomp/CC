import java.util.Scanner;

public class CaughtSpeeding {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for(int count = 0; count<testAmount; count++){

                String trip = input.nextLine();

                String[] userInput = trip.split(" ");

                int speed = Integer.parseInt(userInput[0]);

                String trueorfalse = userInput[1];

                if(trueorfalse.equals("true")){


                    if(speed<=65){
                        System.out.println("no ticket");

                    }

                    if(speed>65 && speed<=85){
                        System.out.println("small ticket");

                    }

                    if(speed>85){
                        System.out.println("big ticket");

                    }

                } else{

                    if(speed<=60){
                        System.out.println("no ticket");

                    }

                    if(speed>60 && speed<=80){
                        System.out.println("small ticket");

                    }

                    if(speed>80){
                        System.out.println("big ticket");

                    }




                }


            }


        }


    }
}
