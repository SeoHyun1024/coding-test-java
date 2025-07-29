import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int T;   // 테스트 케이스 갯수
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    T = Integer.parseInt(br.readLine());
	  
	    for (int i =0 ; i < T; i++){
	        char[] str = br.readLine().toCharArray();
	        StringBuilder sb = new StringBuilder();
	        
	        sb.append(str[0]);
	        sb.append(str[str.length - 1]);
	        System.out.println(sb.toString());
	    }
	}
}