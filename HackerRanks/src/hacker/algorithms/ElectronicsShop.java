package hacker.algorithms;

import java.util.Arrays;

public class ElectronicsShop {

	public void run() {
		int b = 10;
		int[] k = {3,1};
		int[] dr = {5,2,8};
		
		int r = getMoneySpent(k, dr, b);
		System.out.println(r);
	}
	
	public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         
         int rows = Math.min(keyboards.length, drives.length);
         int cols = Math.max(keyboards.length, drives.length);
         int maxPrice = 0;

         int[][] sums = new int[rows][cols];
         
         
         for(int i = 0; i<rows; i++) {
        	 for(int j = 0; j<cols ;j++) {
        		 sums[i][j] = keyboards[i]+drives[j];
        	 }
         }
         
         for(int i = 0; i<rows; i++) {
        	 for(int j = 0; j<cols ;j++) {
        		 int summ = sums[i][j];
        		 if(summ > maxPrice && summ <= b) maxPrice = summ;
        	 }
         }
         
         if(maxPrice == 0) return -1;
         return maxPrice;

    }
}
