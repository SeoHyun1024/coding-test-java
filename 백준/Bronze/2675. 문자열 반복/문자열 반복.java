import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int T;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    T = Integer.parseInt(br.readLine());
	    
	    while(T-- > 0){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        String str = st.nextToken();
	        
	        
	        char[] arr = new char[str.length() * N];
	        int idx = 0;
	        for (int x = 0; x < str.length(); x++){
	            for (int i = 0; i < N; i++){
	                arr[idx] = str.charAt(x);
	                idx++;
	            }
	        }
	        
	        System.out.println(arr);
	    }
	}
}