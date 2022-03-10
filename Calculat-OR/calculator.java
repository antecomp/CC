import java.util.*;
import java.lang.Math;
public class calculator {
    public static String F(double x) {
        return String.format("%.1f", x);
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in);){
            int t = Integer.parseInt(input.nextLine());
            for (int i=0; i<t; i++) {
                String[] part = input.nextLine().split(" ");
                double firstNum = Double.parseDouble(part[0]);
                String operator = part[1];
                double lastNum = Double.parseDouble(part[2]);
                String r = "";
                if (operator.equals("+")) {
                    double rn = Double.parseDouble(F(firstNum + lastNum));
                    double n2 = Double.parseDouble(F(lastNum + firstNum));
                    r = r+rn;
                    r+=" ";
                    r = r+n2;
                } else if (operator.equals("-")) {
                    double rn = Double.parseDouble(F(firstNum - lastNum));
                    double n2 = Double.parseDouble(F(lastNum - firstNum));
                    r = r+rn;
                    r+=" ";
                    r = r+n2;

                } else if (operator.equals("*")) {
                    double rn = Double.parseDouble(F(firstNum * lastNum));
                    double n2 = Double.parseDouble(F(lastNum * firstNum));
                    r = r+rn;
                    r+=" ";
                    r = r+n2;

                } else {
                    double rn = Double.parseDouble(F(firstNum / lastNum));
                    double n2 = Double.parseDouble(F(lastNum / firstNum));
                    r = r+rn;
                    r+=" ";
                    r = r+n2;
                }
                System.out.println(r);
            }
        }
    }
}
