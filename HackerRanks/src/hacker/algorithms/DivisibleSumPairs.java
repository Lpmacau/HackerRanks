package hacker.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleSumPairs {
	public void run() {
		int k = 3;
		int s[] = {1,3,2,6,1,2};
		System.out.println(divisibleSumPairs(s.length,k,s));
	}
	
	
	public int divisibleSumPairs(int n, int k, int[] ar) {
		int res = 0;
		
		for(int i = 0; i<n ; i++) {
			
			for(int j = 0; j<n ;j++ ) {
				if(i<j && (ar[i] + ar[j]) % k == 0) {
					res++;
				}
			}
		}
		
		return res;
    }
	
}
