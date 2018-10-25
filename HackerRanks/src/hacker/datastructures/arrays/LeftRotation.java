package hacker.datastructures.arrays;

import java.util.Arrays;

public class LeftRotation {
	public void run() {
		
		int[] a = {1,2,3,4,5};
		
		Arrays.stream(leftRotation(4,a)).forEach(x -> System.out.print(x+" "));
	}

	private int[] leftRotation(int nRot, int[] arr){
		int len = arr.length;
		int[] rotatos = new int[len];
		
		for(int i = 0; i<len; i++) {
			
			// Se i < nRot, novoI = len-1-i
			if(i<nRot) 
				rotatos[len+i-nRot] = arr[i];
			else 
				rotatos[i-nRot] = arr[i];
		}

		return rotatos;
    }
}
