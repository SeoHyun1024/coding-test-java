import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());
	    
	    int result = 1;
	    for (int i = 1; i <= N; i++){
	        result *= i;
	    }
	    
	    System.out.println(result);
	}
}