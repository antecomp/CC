import java.util.Scanner;
import java.lang.Math;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try (input) {

            int testCases = Integer.parseInt(input.nextLine());

            for (int count = 0; count < testCases; count++) {

                int numofAstroids = Integer.parseInt(input.nextLine());


                double[] sortedDistence = new double[numofAstroids];

                String[] inputSafe = new String[numofAstroids];


                for (int i = 0; i < numofAstroids; i++) {


                    String doublenum = input.nextLine();

                    inputSafe[i] = doublenum;

                    String[] sepnums = doublenum.split(" ");

                    double first = Double.parseDouble(sepnums[0]);
                    double second = Double.parseDouble(sepnums[1]);

                    double distence = Math.sqrt((first * first) + (second * second));
                    sortedDistence[i] = distence;

                }

                for (int k = 0; k < sortedDistence.length; k++) {
                    for (int m = 0; m < k; m++)
                        if (sortedDistence[k] < sortedDistence[m]) {
                            var x = inputSafe[k];
                            inputSafe[k] = inputSafe[m];
                            inputSafe[m] = x;
                            var y = sortedDistence[k];
                            sortedDistence[k] = sortedDistence[m];
                            sortedDistence[m] = y;
                        }
                }
                for (int b = 0; b < inputSafe.length; b++) {
                    System.out.println(inputSafe[b]);

                }
            }
        }
    }
}