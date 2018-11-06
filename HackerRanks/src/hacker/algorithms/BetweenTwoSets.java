package hacker.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
	
	public void run() {
		int a[] = {1};
		int b[] = {100};
		
		System.out.println(getTotalX(a,b));
		
	}
	
	public int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int maxA = Arrays.stream(a).max().getAsInt();
        int maxB = Arrays.stream(b).max().getAsInt();
        
        List<Integer> res = new ArrayList<Integer>();
        boolean shouldAdd = true;

        for(int i = maxA; i<=maxB; i++){
            
            for(int j = 0; j<a.length && shouldAdd; j++){
                if(i % a[j] != 0) 
                	shouldAdd = false;
            }

            for(int j = 0; j<b.length && shouldAdd; j++){
                if(b[j] % i != 0) 
                	shouldAdd = false;
            }

            if(shouldAdd) res.add(i);
            shouldAdd = true;
        }

        return res.size();
    }

}
