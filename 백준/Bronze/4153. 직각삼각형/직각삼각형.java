import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] arr;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    
	    
	    while(true){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        arr = new int[3];
	        for (int i = 0; i < 3; i++) {
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        if (Arrays.equals(arr, new int[] {0, 0, 0})) break;
	        else {
	            Arrays.sort(arr);  // 오름차순 정렬
	            if (Math.pow(arr[2], 2) == Math.pow(arr[1], 2) + Math.pow(arr[0], 2)) {
	                System.out.println("right");
	            }
	            else {
	                System.out.println("wrong");
	            }
	            
	        }
	    }
	}
}