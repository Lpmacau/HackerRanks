package hacker.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	
	public void run() {
		System.out.println(isAnagram("ARAY","RYAA"));
		System.out.println(isAnagram("ARAAY","RYAA"));
		System.out.println(isAnagram("Hello","hello"));
	}
	
	public int arrayContains(char[] arr, char c) {
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == c) return i;
		}
		
		return -1;
	}

	public int findOccurrences(char c, String b) {
		int res = 0;
		for(int i=0; i<b.length(); i++) {
			if(b.charAt(i) == c) res++;
		}
		return res;
	}
	
	public boolean isAnagram(String a, String b) {
		int l = a.length();
		if(l != b.length()) return false;
		char[] chars = new char[l];
		int[] aChars = new int[l];
		int[] bChars = new int[l];
		int j;
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		for(int i = 0; i<l; i++) {
			j = arrayContains(chars,a.charAt(i));
			if(j != -1) {
				aChars[j]++;
			}
			else {
				chars[i] = a.charAt(i);
				aChars[i] = 1;
			}
		}
		
		for(int i = 0; i<chars.length; i++) {
			// Compare occurrences
			if(findOccurrences(chars[i],b) != aChars[i]) {
				return false;
			}
			
		}
		
		return true;
    }

}
