package hacker.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class SockMerchant {
	
	public void run() {
		
		int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(ar.length, ar));
	}
	
	public int sockMerchant(int n, int[] ar) {

        Map<Integer,Integer> socks = new HashMap<Integer,Integer>();

        for(int i = 0; i<n; i++){
            if(socks.get(ar[i]) == null){
                socks.put(ar[i], 1);
            }
            else{
                socks.replace(ar[i],socks.get(ar[i])+1);
            }
        }

        int res = socks.entrySet()
                        .stream()
                        .filter(x -> x.getValue()/2 >= 1)
                        .map(Map.Entry::getValue)
                        .reduce(0, (a,b) -> doubleOrNothing(a,b));
        
        return res;
    }

	private Integer doubleOrNothing(Integer a, Integer b) {
		return a + (b/2);
	}


	
	

}
