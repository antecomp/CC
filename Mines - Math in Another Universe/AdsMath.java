import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdsMath {
    public static Integer performOperation(String exp) {
        String[] expArr = exp.split(" ");

        String op = expArr[1];
        int arg1 = Integer.parseInt(expArr[0]);
        int arg2 = Integer.parseInt(expArr[2]);

        switch (op) {
            case "*":
                return arg1 * arg2;
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "/":
                return arg1 / arg2;
        }
        return null;
    }

    public static String applyOperations(List<Matcher> matchers, String equation) {
        for (Matcher matcher : matchers) {
            while (matcher.find()) {
                String group = matcher.group();
				// System.out.println("Match: " + matcher.group());
                equation = equation.replace(group, String.valueOf(performOperation(group)));
				// System.out.println("New Eq: " + equation);
				matcher = matcher.pattern().matcher(equation); // Push new equation back into matcher using its last pattern
            }
        }

        return equation;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {

                String equation = input.nextLine();

                // this holds patterns in-order (so in our case first add/sub, then mul/div)
                List<Matcher> matchers = List.of(
                        Pattern.compile("-?\\d+\\s(\\-|\\+)\\s-?\\d+").matcher(equation),
                        Pattern.compile("-?\\d+\\s(\\*|\\/)\\s-?\\d+").matcher(equation)
                );

                String res = applyOperations(matchers, equation);

                System.out.println("Calculation Completed, Result = " + res);

            }
        }
    }
}
