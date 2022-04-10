import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class boilerplate {

	public static double length(int[] c1, int[] c2) {
		return Math.hypot((double) c1[0] - c2[0], (double) c1[1] - c2[1]);
	}

	public static double slope(int[] c1, int[] c2) {
		if(c2[0] - c1[0] == 0) return -1; // super secret key :)
		return Math.abs(
			(c2[1] - c1[1]) / (c2[0] - c1[0])
			);
	}



	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){ 
			


			/*int cord1[] = new int[]{input.nextInt(), input.nextInt()};
			int cord2[] = new int[]{input.nextInt(), input.nextInt()};
			int cord3[] = new int[]{input.nextInt(), input.nextInt()};
			int cord4[] = new int[]{input.nextInt(), input.nextInt()}; 

	

			// CORDS MUST BE SORTED IN CLOCKWISE ORDER


			double[] lineA = new double[]{
				length(cord1, cord2),
				slope(cord1, cord2)
			};

			double[] lineB = new double[] {
				length(cord2, cord3),
				slope(cord3, cord4)
			};

			double[] lineC = new double[] {
				length(cord3, cord4),
				slope(cord3, cord4)
			};
			double[] lineD = new double[] {
				length(cord1, cord4),
				slope(cord1, cord4)
			};

			diagonal


			System.err.println(Arrays.toString(lineA));
			System.err.println(Arrays.toString(lineB));
			System.err.println(Arrays.toString(lineC));
			System.err.println(Arrays.toString(lineD)); */


			int xa = input.nextInt();
			int ya = input.nextInt();
			int xb = input.nextInt();
			int yb = input.nextInt();
			int xc = input.nextInt();
			int yc = input.nextInt();
			int xd = input.nextInt();
			int yd = input.nextInt();

			double a = Math.sqrt((xb - xa) * (xb - xa) + (yb - ya) * (yb - ya));
			double b = Math.sqrt((xc - xb) * (xc - xb) + (yc - yb) * (yc - yb));
			double c = Math.sqrt((xd - xc) * (xd - xc) + (yd - yc) * (yd - yc));
			double d = Math.sqrt((xa - xd) * (xa - xd) + (ya - yd) * (ya - yd));

			double diagonal_ac = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));
			double diagonal_bd = Math.sqrt((xd - xb) * (xd - xb) + (yd - yb) * (yd - yb));

			double A = Math.acos((a * a + d * d - diagonal_bd * diagonal_bd) / (2 * a * d));
			double B = Math.acos((b * b + a * a - diagonal_ac * diagonal_ac) / (2 * b * a));
			double C = Math.acos((c * c + b * b - diagonal_bd * diagonal_bd) / (2 * c * b));
			double D = Math.acos((d * d + c * c - diagonal_ac * diagonal_ac) / (2 * d * c));

		if (A == B && A == C && A == D) {

			if (a == b && a == c && a == d) {
				System.out.println("Quadrilateral is square...\n");
			} else {
				System.out.println("Quadrilateral is rectangular...\n");
			}

		} else if (a == b && a == c && a == d) {
			System.out.println("Quadrilateral is diamond(Rhombus)...\n");
		} else if (a == c && b == d) {
		System.out.println("Quadrilateral is parallelogram...");
		}
		else  {
			System.out.println("Quadrilateral is just a quadrilateral...\n");
		}
		}
	}
}