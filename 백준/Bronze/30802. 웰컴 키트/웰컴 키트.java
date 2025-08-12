import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N, T, P;
    public static int[] arr;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());    // 사람 수
	    
	    // 셔츠 주문 수량
	    StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st1.nextToken());  // 티셔츠 묶음 수
        P = Integer.parseInt(st1.nextToken());  // 펜 수
	    
	    int shirts = 0;
	    for (int i : arr){
	        shirts += Math.ceil((double) i / (double) T);
	    }
	    
	    System.out.println(shirts);
	    System.out.printf("%d %d", (N / P), (N % P));
	}
}