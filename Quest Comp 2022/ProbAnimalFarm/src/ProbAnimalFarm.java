import java.util.Scanner;

public class ProbAnimalFarm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for(int count = 0; count<testAmount; count++){

                String trip = input.nextLine();

                String[] splitTrip = trip.split(" ");

                int totalOne = Integer.parseInt(splitTrip[0]);
                int totalTwo = Integer.parseInt(splitTrip[1]);
                int totalThree = Integer.parseInt(splitTrip[2]);

                System.out.println(totalOne*2+totalTwo*4+totalThree*4);

            }


        }


    }

}
