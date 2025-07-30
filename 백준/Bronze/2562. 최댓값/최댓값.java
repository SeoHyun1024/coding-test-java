import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int[] arr = new int[9];
	    
	    for (int i = 0 ; i < 9; i++){
	        arr[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int max = Integer.MIN_VALUE;
	    int max_index = 0;
	    
	    for (int i =0 ;i < 9; i++){
	        if (arr[i] > max){
	            max = arr[i];
	            max_index = i + 1;
	        }
	    }
	    
	    System.out.println(max + "\n" + max_index);
	    
	}
}