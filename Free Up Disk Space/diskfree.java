import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class diskfree {

	public static class file {
		private String name;
		private double score;
		private double fileSize;
		public file(String details) {
			//System.out.println(details);
			this.name = details.substring(
				details.lastIndexOf(" ") + 1 // get the last part of the string after the last space (file name)
			);
			
			// pattern match the date part of the string

			Matcher dateMatcher = Pattern.compile("\\d+\\/\\d+\\/\\d+").matcher(details);
			dateMatcher.find();
			String date =  dateMatcher.group();
			// this idea is stupid
			// String date = details.substring(0, 10);
			// System.out.println(date);
			//String AMPM = Pattern.compile("AM|PM").matcher(details).group(); // we only care about this for the half-day jargon
			boolean isAM = details.contains("AM");
			// System.out.println(isAM);

			Matcher inputMatch = Pattern.compile("M\\s\\d+").matcher(details);
			inputMatch.find();
			String inputSize = inputMatch.group().substring(2); // cut off the M xd - only used to get the right spot
			// System.out.println(inputSize);
			double size = Integer.parseInt(inputSize);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // this is how the input formats the date
			LocalDate dateFormatted = LocalDate.parse(date, formatter); // this is how we parse the date
			LocalDate AntiEpoch = LocalDate.parse("2019-04-27"); // situational current date - AntiEpoch sounds cool :)

			// Get days between - INCLUDING LEAP DAYS/YEARS
			double daysBetween = Math.abs(AntiEpoch.until(dateFormatted, ChronoUnit.DAYS));
			if (!isAM) {
				daysBetween -= 0.5;	// half a day older if created in the morning
			}
			//System.out.println("Days between: " + daysBetween);

			// convert KB to MB
			double sizeMB = size / 1000.0; // technically 1024 but Lockheed dumb :)
			this.fileSize = sizeMB;
			//System.out.println("Size in Mb: " + fileSize);

			this.score = (daysBetween * sizeMB);
			//System.out.println("Calculated Score: " + score);

		}

		// I hate having to use getters
		public String getName() {
			return name;
		}

		public double getScore() {
			return score;
		}

		public double getFileSize() {
			return fileSize;
		}
	}
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) { // solution starts below

				String stupidSTDINhandling = input.nextLine(); // nightmare
				int numFiles = Integer.parseInt(
					stupidSTDINhandling.substring(0, stupidSTDINhandling.indexOf(" ")
				)); 
				double hardDriveSize = Double.parseDouble(
					stupidSTDINhandling.substring(
						stupidSTDINhandling.indexOf(" ") + 1
					)
				);

				//int numFiles = input.nextInt();
				// float hardDriveSize = input.nextFloat();
				// input.next(); // skip the newline

				ArrayList<diskfree.file> files = new ArrayList<diskfree.file>();

				for(int i = 0; i < numFiles; i++) { // add each file
					files.add(new diskfree.file(input.nextLine()));
				}

				// sort the files by score
				Collections.sort(files, new Comparator<diskfree.file>() {
					@Override
					public int compare(diskfree.file o1, diskfree.file o2) {
						return (int) o2.getScore() - (int) o1.getScore(); // WOO TYPECASTING YEAAAHHH
					}
				});

				// there are bugs under your skin
				double usedSpace = 0;
				int i = 0;
				while(usedSpace < (hardDriveSize * 250) && i < numFiles) { // only list the files up until it is >= 0.25 * hard drive size
					usedSpace += files.get(i).getFileSize();
					System.out.println(files.get(i).getName() + " " + 
					String.format("%.3f", 
					files.get(i).getScore()));
					i++;
				}

				
			}
		}
	}
}