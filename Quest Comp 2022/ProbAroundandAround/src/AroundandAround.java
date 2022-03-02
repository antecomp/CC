import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
public class AroundandAround {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        try(input){

            int testAmount = Integer.parseInt(input.nextLine());

            for(int i = 0; i<testAmount; i++){

                double alt = Double.valueOf(input.nextLine());
                double orbit = (40075/(2*Math.PI)+alt)*(2*Math.PI);

                System.out.println(Double.valueOf(df.format(orbit)));


            }





        }




    }
}
