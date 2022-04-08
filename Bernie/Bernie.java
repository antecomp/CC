package Bernie;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.stream.Collectors;

import Bernie.Trip;

public class Bernie {

	public static void testSort(ArrayList<Trip> iTrip) {
		for(Trip x : iTrip) {
			System.out.println(String.format("%s %s", 
				x.location,
				String.valueOf(x.getYear())
			));
		}
	}

	public static int findTrip(ArrayList<Trip> iTrip, String name, int time) {
		List<Trip> countryTrips = iTrip.stream()
		.filter(trip -> trip.location.contains(name))
		.collect(Collectors.toList());
		
		// sorting after filtering is marginally more cpu-efficent - per my own tests
		Collections.sort(countryTrips, (Trip t1, Trip t2) -> { 
			return t1.getYear() - t2.getYear();
		});

		return countryTrips.get(time - 1).getYear(); // kth trip - 1 will hit the correct index of the already sorted trips
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			ArrayList<Trip> BTrips = new ArrayList<Trip>();
			int numTrips = input.nextInt();

			for(int i = 0; i < numTrips; i++) {
				Trip addMe = new Trip(input.next(), input.nextInt());
				BTrips.add(addMe);
			}

			/* Collections.sort(BTrips, (Trip t1, Trip t2) -> { // sort trips by year descending
				return t1.getYear() - t2.getYear();
			}); */

			//testSort(BTrips);

			int numQrr = input.nextInt();

			for(int i = 0; i < numQrr; i++) {
				String queryCountry = input.next();
				int queryTime = input.nextInt();
				System.out.println(findTrip(BTrips, queryCountry, queryTime));
			}

		}
	}
}

/* public class Trip {
	private int year;
	public String location;
	public Trip(String loc, int yr) {
		year = yr;
		location = loc;
	}
	public int getYear() {
		return year;
	}
} */