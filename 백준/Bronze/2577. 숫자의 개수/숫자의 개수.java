import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static long A, B, C;
    static int[] count;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    A = Long.parseLong(br.readLine());
	    B = Long.parseLong(br.readLine());
	    C = Long.parseLong(br.readLine());
	    
	    long result = A*B*C;
	    String str= Long.toString(result);  // 결과값 문자열로 변환
	    
	    count = new int[10];
	    for (int i  = 0; i< str.length() ;i++){
	        count[str.charAt(i) - '0']++;
	    }
	    
	    for (int x : count){
	        System.out.println(x);
	    }
	}
}