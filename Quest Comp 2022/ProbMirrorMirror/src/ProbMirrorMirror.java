import java.util.Scanner;

public class ProbMirrorMirror {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try(input){

            int testAmounts = Integer.parseInt(input.nextLine());

            for (int count = 0; count<testAmounts ; count++){

                String sentence = input.nextLine();

                char charArray[]= new char[sentence.length()];

                for(int i = 0; i<sentence.length(); i++){

                    charArray[i] = sentence.charAt(i);
                }

                for(int j=sentence.length()-1; j>=0; j--){

                    System.out.print(charArray[j]);

                }
                System.out.println();
            }
        }

    }

}
