import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = st.countTokens();
	    
	    System.out.println(N);
	}
}