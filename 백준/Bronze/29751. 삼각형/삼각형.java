import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int W, H;
    public static double S;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    W = Integer.parseInt(st.nextToken());
	    H = Integer.parseInt(st.nextToken());
	    
	    S = (double) W * H / 2;

	    System.out.printf("%.1f", S);
	}
}