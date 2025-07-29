import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, V;
    static int cnt;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());

	    int[] arr = new int[N];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 0; i< N; i++){
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    V = Integer.parseInt(br.readLine());
	    cnt = 0;
	    for (int i : arr){
	        if (i == V) cnt++;
	    }
	    
	    System.out.println(cnt);
	}
}