import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    N = Integer.parseInt(br.readLine());
	    
	    for (int i = 1; i < 18259; i++){
	        if (N > phase(i - 1) && N <= phase(i)){
	            System.out.println(i);
	            break;
	        }
	    }
	 
	}
	
	public static int phase(int n){
	    if (n == 0 || n == 1) return n;
	    else return 3*n*(n-1) + 1;
	}
}