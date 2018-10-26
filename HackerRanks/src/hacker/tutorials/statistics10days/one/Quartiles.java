package hacker.tutorials.statistics10days.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quartiles {

	public void run() {

		int[] values = { 3, 7, 8, 5, 12, 14, 21, 13, 18 };
		quartiles(values);

	}

	private void quartiles(int[] values) {
		Arrays.sort(values);
		List<Integer> vals = new ArrayList<Integer>();

		int q2 = (int) median(values);

		for (int i : values) {
			vals.add(i);
		}

		List<Integer> q1Vals = vals.stream().filter(x -> x < q2).collect(Collectors.toList());
		List<Integer> q3Vals = vals.stream().filter(x -> x > q2).collect(Collectors.toList());

		int[] q1V = new int[q1Vals.size()];
		int[] q3V = new int[q3Vals.size()];

		for(int i = 0; i< q1Vals.size(); i++) q1V[i] = q1Vals.get(i);
		for(int i = 0; i< q3Vals.size(); i++) q3V[i] = q3Vals.get(i);
		

		int q1 = (int) median(q1V);
		int q3 = (int) median(q3V);
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
	}

	private static double median(int[] values) {
		int l = values.length;
		Arrays.sort(values);

		// Se for par, faz se a media do -1 e +1
		if (l % 2 == 0)
			return (double) (values[l / 2 - 1] + values[l / 2]) / 2;
		return values[l / 2];
	}

}
