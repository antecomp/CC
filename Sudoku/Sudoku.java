import java.util.*;

public class Sudoku {
    public static boolean correctSet(int[] checkme) {
        int res = 0;
        for(int i : checkme) {
            res += i;
        }
        return (res == 45);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                int[][] table = new int[9][9];

                for(int i = 0; i < 9; i++) {
                    String[] inputRow = input.nextLine().split(" ");
                    for(int j = 0; j < inputRow.length; j++) {
                        table[i][j] = Integer.parseInt(inputRow[j]);
                    }
                }

                for(int[] row : table) {
                    if(!correctSet(row)) {
                        System.out.println("INVALID");
                        return;
                    }
                    }

                for(int col = 0; col < 9; col++) { // temparray = each column
                    int[] tempArray = new int[9];
                    for(int row = 0; row < 9; row++) {
                        tempArray[row] = table[row][col];
                    }
                    if(!correctSet(tempArray)) {
                        System.out.println("INVALID");
                        return;
                    }
                }
                System.out.println("VALID");
            }
        }
    }
}
