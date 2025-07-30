import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int[] arr = new int[N];
	    for (int i = 0 ; i < N; i++){
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    for (int i = 0 ;i < N; i++){
	        if (arr[i] > max){
	            max = arr[i];
	        }
	        if (arr[i] < min){
	            min = arr[i];
	        }
	    }
	    
	    System.out.println(min + " " + max);
	}
}