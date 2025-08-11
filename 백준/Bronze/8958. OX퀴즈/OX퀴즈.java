import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int T;
    public static char[] arr;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    T = Integer.parseInt(br.readLine());
	    
	    while(T-- > 0){
	        String str = br.readLine();
	        arr = str.toCharArray();
	        
	        int cnt = 0, total_score = 0;
	        for (int i = 0; i < arr.length; i++){
	            cnt = (arr[i] == 'X') ? 0 : cnt + 1;
	            
	            total_score += cnt;
	        }
	        System.out.println(total_score);
	    }
	}
}