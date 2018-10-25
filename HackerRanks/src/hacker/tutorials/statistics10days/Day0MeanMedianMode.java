package hacker.tutorials.statistics10days;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

// Calculo da media mediana e moda
public class Day0MeanMedianMode {
	public static void main(String args[]) {

		int[] values = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060 };

		System.out.println(mean(values));
		System.out.println(median(values));
		System.out.println(mode(values));

	}

	private static double mode(int[] values) {
		TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
		
		// Inserir contagem no treeMap
		for(int i = 0; i<values.length; i++) {
			// Nao existe
			if(!t.containsKey(values[i])) {
				t.put(values[i], 1);
			}
			else {
				t.replace(values[i], t.get(values[i])+1);
			}
		}
		
		return t.firstEntry().getKey();
	}

	private static double median(int[] values) {
		int l = values.length;
		Arrays.sort(values);
		
		// Se for par, faz se a media do -1 e +1
		if(l % 2 == 0) return (double) (values[l/2 - 1] + values[l/2])/2;
		return values[l/2];
	}

	private static double mean(int[] values) {
		return (double) (Arrays.stream(values).sum())/values.length;
	}

}
