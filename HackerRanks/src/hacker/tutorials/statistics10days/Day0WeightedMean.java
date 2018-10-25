package hacker.tutorials.statistics10days;

public class Day0WeightedMean {

	public static void main(String args[]) {

		int[] values = {10,40,30,50,20,10,40,30,50,20 };
		int[] w = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(weightedMean(values,w));

	}

	private static double weightedMean(int[] values, int[] w) {
		double sum = 0;
		double wei = 0;
		
		for(int i = 0; i<values.length; i++) {
			sum += values[i] * w[i];
			wei += w[i];
		}
		
		return sum/wei;
	}
}
