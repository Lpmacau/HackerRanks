package hacker.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import hacker.entry.Executable;

public class HowManySubStrings {
	public void run() {
		String s = "aabaa";
		
		int[][] q = {{1,1},{1,4},{1,1},{1,4},{0,2}};

		int a[] = countSubstrings(s, q);
		
		char[] as = new char[10];
		
		
		Arrays.stream(a).forEach(x -> System.out.println(x));
		
	}

	
	public int[] countSubstrings(String s, int[][] queries) {
        /*
         * Write your code here.
         */

		int nQueries = queries.length;
		int[] res = new int[nQueries];
		Object[][] strs = new Object[nQueries][nQueries];
		Set<String> one;
		int[][] res2 = new int[nQueries][nQueries];
		int min,max;
		
		
		for(int i = 0; i<s.length(); i++) {
			for(int j = i; j<s.length(); j++) {
				String sub = s.substring(i, j+1);
				
				for(int[] a : queries) {
					min = a[0];
					max = a[1];
					if(i >= min && j <= max) {
						
						if(strs[min][max] == null) {
							one =  new HashSet<String>();
							one.add(sub);
							strs[min][max] = one;
							res2[min][max] = 1;
						}
						else {
							one = (HashSet<String>) strs[min][max];
							if(one.add(sub)) res2[min][max]++;
						}
					
					}
				}
			}
		}
		
		for(int k = 0; k<nQueries;k++) {
			res[k] = res2[queries[k][0]][queries[k][1]]	;
		}
		
		
		return res;
    }
}
