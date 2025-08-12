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
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 0 ; i < N; i++){
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
        
        int isPrime[] = new int[1002];
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 0;
        
        for (int i = 2; i < 1001; i++){
            if (isPrime[i] == 1){
                for (int j = i * i; j < 1001; j += i){
                    isPrime[j] = 0;
                }
            }
        }
        
        int cnt = 0;
        for (int i : arr){
            if (isPrime[i] == 1) cnt++;
        }
        
        System.out.println(cnt);
        
        
	}
	
}