package hacker.datastructures.arrays;

public class Subarray {
	
	
	public void run() {
			
		int[] a = {1,-2,4,-5,1};
		
		System.out.println(negativeSubArrays(a));
	}

	private int negativeSubArrays(int[] a) {
		int l = a.length;
		int res = 0;
		
		for(int i = 0; i<l ; i++) {
			for(int j = i; j<l ;j++){
				// Sum from to
				if(sumFromTo(i,j,a) < 0)
					res++;
			}
		}
		
		
		return res;
	}

	private int sumFromTo(int i, int j, int[] a) {
		int k,res;
		
		for(res=0,k=i; k<=j; k++) res += a[k];

		return res;
	}
}
