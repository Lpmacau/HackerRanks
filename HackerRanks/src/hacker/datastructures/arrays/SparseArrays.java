package hacker.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SparseArrays {
	public void run() {
		
		
		String[] s = {"abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf"};
		String[] q = {"abcde","sdaklfj","asdjf","na","basdn"};
		
		matchingStrings(s, q);
	
	}
	
	private int[] matchingStrings(String[] strings, String[] queries) {
		int[] res = new int[queries.length];
		Map<String,Integer> qCount = new HashMap<String,Integer>();
		
		for(String q : queries) qCount.put(q, 0);
		
		Arrays.stream(strings)
			  .forEach(query -> {
				  if(qCount.containsKey(query)) {
					  qCount.replace(query,qCount.get(query)+1);
				  }
			  });
		
		for(int i = 0; i<queries.length; i++){
			res[i] = qCount.get(queries[i]);
		}

		
		return res;
    }
}
