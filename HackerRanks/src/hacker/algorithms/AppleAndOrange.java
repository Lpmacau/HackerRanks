package hacker.algorithms;

import java.util.Arrays;

public class AppleAndOrange {
	
	public void run() {
		int[] apples = {2,3,-4};
		int[] oranges = {3,-2,-4};
		int s = 7;
		int t = 10;
		int a = 4;
		int b = 12;
		
		Arrays.stream(countApplesAndOranges(s, t, a, b, apples, oranges))
			  .forEach(x -> System.out.println(x));
		
	}

	
	private int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int nApples, nOranges;
		nApples = nOranges = 0;
		
		// Verificar se o numero de frutas e igual
		// Evita fazer mais que uma passagem
		if(apples.length == oranges.length) {
			for(int i = 0; i<apples.length; i++) {
				// Se a +- apples[i] estiver entre s->t, caiu dentro
				if(a + apples[i] >= s && a + apples[i] <= t ) nApples++;
				if(b + oranges[i] >= s && b + oranges[i] <= t ) nOranges++;
			}
		}
		else {
			// Contagem das macas
			for(int i = 0; i<apples.length; i++) {
				if(a + apples[i] >= s && a + apples[i] <= t ) nApples++;
			}
			// Contagem das laranjas
			for(int i = 0; i<oranges.length; i++) {
				if(b + oranges[i] >= s && b + oranges[i] <= t ) nOranges++;
			}
		}

		int[] res = {nApples,nOranges};
		
		return res;
    }
}
