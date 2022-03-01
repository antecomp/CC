import java.util.*;
public class asteroid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            int testNum = Integer.parseInt(input.nextLine());
            for (int i=0; i<testNum; i++) {
                int aNum = Integer.parseInt(input.nextLine());
                ArrayList<String> asteroidDistances = new ArrayList<String>();
                ArrayList<String> asteroidList = new ArrayList<String>();
                for (int j=0; j<aNum; j++) {
                    String x = input.nextLine();
                    asteroidDistances.add(x);
                    asteroidList.add(x);
                }
                double[] nums = new double[asteroidDistances.size()];
                int a=0;
                for (String t : asteroidDistances) {
                    String[] d = t.split(" ");
                    nums[0]=Double.parseDouble(d[0]);
                    nums[1]=Double.parseDouble(d[1]);
                    double distance = Math.sqrt(nums[0]*nums[0] + nums[1]*nums[1]);
                    asteroidDistances.set(a, Double.toString(distance));
                    a++;
                }
                ArrayList<Double> asteroidDoubles = new ArrayList<Double>();
                for (String x:asteroidDistances) {
                    asteroidDoubles.add(Double.parseDouble(x));
                }
                String[] asteroidNames = new String[asteroidList.size()];
                double[] asteroidDistance = new double[asteroidDistances.size()];
                for (int q=0; q<asteroidList.size(); q++) {
                    asteroidNames[q] = asteroidList.get(q);
                    asteroidDistance[q] = Double.parseDouble(asteroidDistances.get(q));
                }
                for (int q=0; q<asteroidDistance.length; q++) {
                    int smallestIndex = q;
                    for (int j=q+1; j<asteroidDistance.length; j++) {
                        if (asteroidDistance[smallestIndex]>asteroidDistance[j]){
                            smallestIndex = j;
                        }
                    }
                    double temp = asteroidDistance[q];
                    asteroidDistance[q] = asteroidDistance[smallestIndex];
                    asteroidDistance[smallestIndex] = temp;
                    String thing = asteroidNames[q];
                    asteroidNames[q] = asteroidNames[smallestIndex];
                    asteroidNames[smallestIndex] = thing;
                }
                for (String s:asteroidNames) {
                    System.out.println(s);
                }
            }
        }
    }
}
