package hacker.datastructures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {
	public static void run() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sca = new Scanner(System.in);

        int n = Integer.parseInt(sca.nextLine());

        int[] vals = Arrays.stream(sca.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int q = Integer.parseInt(sca.nextLine());

        for(int i = 0; i<q; i++) {
        	
            String command = sca.nextLine();
            int[] params = Arrays.stream(sca.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

            switch(command){
                case "Insert":
                    vals = insertAtPosition(vals,n,params[0],params[1]);
                break;
                case "Delete":
                    vals = deleteAtPosition(vals,params[0]);
                break;
            }
        }
        
        Arrays.stream(vals).forEach(System.out::print);
        System.out.print("\n");
    }

    public static int[] deleteAtPosition(int[] arr, int index){
    	int res[] = new int[arr.length-1];
    	
    	for(int i = 0; i<index ; i++)
    		res[i] = arr[i];
    	
    	for(int i = index+1; i<arr.length  ; i++)
    		res[i-1] = arr[i];
        
    	return res;
    }

    public static int[] insertAtPosition(int[] arr,int size, int index, int val){
        int res[] = new int[size+1];

        

        if(index >= size){
        	for(int i = 0; i<size;i++) {
        		res[i] = arr[i];
        	}
            res[size] = val;
        }
        else{
            int last,temp,i;
            // Add at index, push everyone else forward
            for(last = val, i = index; i<size+1; i++){
                temp = res[i];
                res[i] = last;
                last = temp;                
            }
        }
        return res;
    }
}
