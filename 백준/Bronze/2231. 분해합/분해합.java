import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N, answer;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    N = Integer.parseInt(br.readLine());
	    answer = 0;
	    
	    for (int i = 1 ; i < N; i++){
	        char[] arr = Integer.toString(i).toCharArray();
	        
	        int sum = 0;
	        for(char c : arr){
	            sum += Integer.parseInt(Character.toString(c));
	        }
	        
	        if (N == sum + i) {
	            answer = i;
	            break;
	        }
	    }
	    System.out.print(answer);
	}
}