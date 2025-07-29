import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static long A, B;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    A = Long.parseLong(st.nextToken());
	    B = Long.parseLong(st.nextToken());
	  
	    long result = A*A  - B*B;
	    System.out.println(result);
	}
}