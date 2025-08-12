import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int T, room;
    public static double H, W, N;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    T = Integer.parseInt(br.readLine());
	    
	    while(T-- > 0){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        H = (double) Integer.parseInt(st.nextToken());
	        W = (double) Integer.parseInt(st.nextToken());
	        N = (double) Integer.parseInt(st.nextToken());
	        
	        
	        int Q = (int) Math.ceil((N / H));
	        double R = (N % H == 0) ? H : N % H ;
	        
	        room = (int) R * 100 + Q;
	        
	        System.out.println(room);
	    }
	}
}