package hacker.algorithms;

import java.util.HashSet;
import java.util.Set;

public class HowManySubStrings {
	public void run() {
		String s = "aabaa";
		
		int[][] q = {{1,1},{1,4},{1,1},{1,4},{0,2}};
		
		System.out.println(countSubstrings(s, q));
		
	}

	
	public int[] countSubstrings(String s, int[][] queries) {
        /*
         * Write your code here.
         */

		int nQueries = queries.length;
		int[] res = new int[nQueries];

		
		for(int i = 0; i<nQueries; i++) {
			
			int min = queries[i][0];
			int max = queries[i][1];
			
			Set<String> str = new HashSet<String>();
			for(int j=max+1; j>min; j--) {
				
				for(int k=min; k<j ; k++) {
					String sub = s.substring(k, j);
					if(!str.contains(sub))
						str.add(sub);
				}
				
			}
			res[i] = str.size();
			
		}
		
		
		return res;
    }
}
