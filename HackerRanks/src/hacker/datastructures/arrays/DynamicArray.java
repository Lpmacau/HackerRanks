package hacker.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
	public void run() {
		int n = 2;
		int q = 5;

		List<Integer> q1 = new ArrayList<Integer>();
		q1.add(1);
		q1.add(0);
		q1.add(5);

		List<Integer> q2 = new ArrayList<Integer>();
		q2.add(1);
		q2.add(1);
		q2.add(7);

		List<Integer> q3 = new ArrayList<Integer>();
		q3.add(1);
		q3.add(0);
		q3.add(3);

		List<Integer> q4 = new ArrayList<Integer>();
		q4.add(2);
		q4.add(1);
		q4.add(0);

		List<Integer> q5 = new ArrayList<Integer>();
		q5.add(2);
		q5.add(1);
		q5.add(1);

		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l.add(q1);
		l.add(q2);
		l.add(q3);
		l.add(q4);
		l.add(q5);

		List<Integer> res = dynamicArray(n, l);
		res.forEach(x -> System.out.println(x));
	}

	private List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		int lastAnswer = 0;
		List<List<Integer>> seqList = new ArrayList<List<Integer>>();
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i<n ;i++) {
			seqList.add(new ArrayList<Integer>());
		}
		
		for (List<Integer> query : queries) {
			int type = query.get(0);
			int x = query.get(1);
			int y = query.get(2);
			// Obter query[i]
			// Fazer resto da divisao por N do XOR entre query[i][1] e lastAnswer
			// 		(query[i] XOR lastAnswer) % N
			// 		O XOR diz nos que query seqList usar
			// 		Append na seqList de query[i][2]
			// se for query tipo 2
			// 		colocar query[i][1] na seqList indicada pelo XOR
			// 		atribuir este valor a lastAnswer
			// 		imprimir lastAnswer

			// query tipo 1
			if (type == 1) {
				seqList.get((x ^ lastAnswer)%n).add(y);
			}
			
			// query tipo 2
			if (type == 2) {
				List<Integer> seq = seqList.get((x ^ lastAnswer)%n);
				int index = y % seq.size();
				lastAnswer = seq.get(index);
				res.add(lastAnswer);
			}
		}

		return res;
	}
}
