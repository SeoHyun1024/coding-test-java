import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, L;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken());   // 학생 수
	    L = Integer.parseInt(st.nextToken());   // 제외할 라벨 숫자
	    
	    int label = 0;

	    while(N > 0){
	        label++;
	        
	        // label에 L이 포함되어 있으면 다음으로
            if(String.valueOf(label).contains(String.valueOf(L))) continue;
            
            N--;
	    }
	    
	    System.out.println(label);
	}
}