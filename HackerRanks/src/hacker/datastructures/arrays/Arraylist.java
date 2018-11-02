package hacker.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public void run() {
		String arg1 = "5";
		String arg2 = "5 41 77 74 22 44";
		String arg3 = "1 12";
		String arg4 = "4 37 34 36 52";
		String arg5 = "0";
		String arg6 = "3 20 22 33";
		String arg7 = "5";
		String arg8 = "1 3";
		String arg9 = "3 4";
		String arg10 = "3 1";
		String arg11 = "4 3";
		String arg12 = "5 5";

		String[] a = { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 };
		
		notMain(a);

	}

	public static void notMain(String[] args) {
		int nNum = Integer.parseInt(args[0]);
		int i = 0;


		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (i = 0; i < nNum; i++)
			list.add(new ArrayList<Integer>());

		for (i = 1; i <= nNum; i++) {
			String[] arrRowItems = args[i].split(" ");
			int j = Integer.parseInt(arrRowItems[0]);

			for (int k = 1; k <= j; k++) {
				int nov = Integer.parseInt(arrRowItems[k]);
				list.get(i - 1).add(nov);
			}
		}
		
		int nQuery = Integer.parseInt(args[i]);
		int end = nQuery + i + 1 ;
		
		for(i = i+1;i<end; i++) {
			String[] arrRowItems = args[i].split(" ");
			int line = Integer.parseInt(arrRowItems[0]) - 1;
			int pos = Integer.parseInt(arrRowItems[1]) - 1;
			
			System.out.println(list.get(line).size() > pos ? list.get(line).get(pos) : "ERROR!");
		}
	}

}
