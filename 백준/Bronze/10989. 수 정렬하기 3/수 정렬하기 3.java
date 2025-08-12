import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;
    public static int[] arr;
    public static int GCD, LCM;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    N = Integer.parseInt(br.readLine());
	    arr = new int[N];
	    for (int i = 0 ; i < N; i++){
	        arr[i] = Integer.parseInt(br.readLine());
	    }
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(N * 3);
        
        for (int i : arr){
            sb.append(i).append("\n");
        }
        
        System.out.print(sb.toString());
	}
}