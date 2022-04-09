package Ladice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ladice {
	public static int[] ftCon(int[] idrawers, int[] options) {
		// return option number if drawer empty
		if(idrawers[options[0]] == 0) { return new int[]{options[0], options[1]}; } 
		if(idrawers[options[1]] == 0) { return new int[] {options[1], options[0]}; }
		return new int[]{-1, -1};
	}

	public static int[] shiftDrawers(int[] idrawers, int[] options) {
		// if option 1s drawers value's drawer is empty, return that drawer - recurse using that drawer if no.
		int targettedDrawerMoveLoc = idrawers[options[0]];
		int altTargettedDrawerMoveLoc = idrawers[options[1]];
		if(
			idrawers[targettedDrawerMoveLoc] == 0
			) {
				idrawers[targettedDrawerMoveLoc] = options[0]; // set the empty drawer to the old value of the now-moved object (its previous location/other option)
				idrawers[options[0]] = options[1]; // move item to now-empty drawer set-itself to the alt number so this can be targetted by other items
			} else if
		(
			idrawers[altTargettedDrawerMoveLoc] == 0
		) {
			idrawers[altTargettedDrawerMoveLoc] = options[1];
			idrawers[options[1]] = options[0];
		} else {
			return new int[]{-1, -1};
		}
		return idrawers;
	}

	public static int[] suffering(int[] idrawers, int[] options) {
		// call shiftdrawers with options - if it succeeds, return what it returns. 
		// if it fails (returns -1)
			// call suffering (and such shiftdrawers) 
	}


	public static void main(String[] args) {	
		try (Scanner input = new Scanner(System.in)){
			String paramsRaw = input.nextLine();
			int[] params = Stream.of(paramsRaw.split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] drawers = new int[params[1]];
			for(int i = 0; i < params[0]; i++) {
				String optionsRaw = input.nextLine();
				int[] options = Stream.of(optionsRaw.split(" ")).mapToInt(Integer::parseInt).toArray();
				if (ftCon(drawers, options)[0] != -1) { // if drawer empty - set the value of that drawer to the alternate position of its item.
					drawers[ftCon(drawers, options)[0]] = ftCon(drawers, options)[1];
				}
			}
		}
	}
}


/*
Occupy drawer with the number representing the opposite option drawer
Recursive check-drawer status function that finds the next available drawer?
Swap function that takes in current array, makes proper placements, returns array - reassing

*/