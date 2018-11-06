package hacker.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BirthdayChocolate {

	public void run() {
		int d = 18;
		int m = 7;
		int s[] = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
		System.out.println(birthday(Arrays.stream(s).collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll),d,m));
	}
	
	public int birthday(List<Integer> s, int d, int m) {
		int[] arr = s.stream().mapToInt(i -> i.intValue()).toArray();
		int restSum = 0;
		int n = 0;
		
		for(int i = 0; i<arr.length-m+1; i++) {
			
			restSum = arr[i];
			for(int j = i+1; j<i+m; j++) {
				restSum += arr[j];
			}
		
			if(restSum == d) 
				n++;
		}
		
		return n;
    }
	
}
