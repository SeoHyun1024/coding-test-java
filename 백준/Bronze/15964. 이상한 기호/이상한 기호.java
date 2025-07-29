import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int A, B;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    A = Integer.parseInt(st.nextToken());
	    B = Integer.parseInt(st.nextToken());
	  
	    int result = A*A  - B*B;
	    System.out.println(result);
	}
}