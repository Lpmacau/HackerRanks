package hacker.tutorials.statistics10days.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterQuartile {

	public void run() {

		int[] values = { 6,12,8,10,20,16 };
		int[] freq = {5,6,7,8,9,10};
		
		int[] values2 = {10,40,30,50,20,10,40,30,50,20,1,2,3,4,5,6,7,8,9,10 };
		int[] freq2 = {1,2,3,4,5,6,7,8,9,10,10,40,30,50,20,10,40,30,50,20};
		
		
		
		int[] constructed = buildFrequencyArray(values2,freq2);
		interQuartiles(constructed);

	}

	private int[] buildFrequencyArray(int[] values, int[] freq) {
		int size = (int) Arrays.stream(freq).sum();
		int[] res = new int[size];
		int cur = 0;
	
		for(int i = 0; i<freq.length; i++) {
			for(int times = freq[i] ; times > 0 ; times--, cur++) {
				res[cur] = values[i];
			}
		}
		
		return res;
	}

	
	private void interQuartiles(int[] values) {
		Arrays.sort(values);
		List<Integer> vals = new ArrayList<Integer>();

		
		int q2 = (int) median(values);

		for (int i : values) {
			vals.add(i);
		}

		List<Integer> q1Vals = vals.stream().filter(x -> x < q2).collect(Collectors.toList());
		List<Integer> q3Vals = vals.stream().filter(x -> x >= q2).collect(Collectors.toList());

		int[] q1V = new int[q1Vals.size()];
		int[] q3V = new int[q3Vals.size()];

		for(int i = 0; i< q1Vals.size(); i++) q1V[i] = q1Vals.get(i);
		for(int i = 0; i< q3Vals.size(); i++) q3V[i] = q3Vals.get(i);
		

		double q1 =  median(q1V);
		double q3 =  median(q3V);
		
		System.out.println(q3 - q1);
	}


	private static double median(int[] values) {
		int l = values.length;
		Arrays.sort(values);

		// Se for par, faz se a media do -1 e +1
		if (l % 2 == 0)
			return (double) (values[(l/2)-1] + values[l / 2]) / 2;
		return values[l / 2];
	}

}
