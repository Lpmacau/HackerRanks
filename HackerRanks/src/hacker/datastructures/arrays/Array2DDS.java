package hacker.datastructures.arrays;

public class Array2DDS {

	public void run() {
		int[][] a = {{1,1,1,0,0,0},
				 {0,1,0,0,0,0},
				 {1,1,1,0,0,0},
				 {0,0,2,4,4,0},
				 {0,0,0,2,0,0},
				 {0,0,1,2,4,0}};
		
		int[][] b = {{-1, -1, 0, -9, -2, -2},
				 {-2, -1, -6, -8, -2, -5},
				 {-1, -1, -1, -2, -3, -4},
				 {-1, -9, -2, -4, -4, -5},
				 {-7, -3, -3, -2, -9, -9},
				 {-1, -3, -1, -2, -4, -5}};
		
		System.out.println(hourglassSum(a));
		System.out.println(hourglassSum(b));
		
	}

	private int hourglassSum(int[][] arr) {
        int bigSum = Integer.MIN_VALUE;
        // target only middle part of the hourglasses (16)
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
                int sum = 0;
                sum += arr[i][j];
                sum += arr[i-1][j];
                sum += arr[i+1][j];
                
                sum += arr[i+1][j-1];
                sum += arr[i+1][j+1];

                sum += arr[i-1][j-1];
                sum += arr[i-1][j+1];
                if(sum > bigSum) bigSum = sum;
            }
        }
        return bigSum;
    }
}
