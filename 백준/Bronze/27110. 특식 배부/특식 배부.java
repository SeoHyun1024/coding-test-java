import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N; // 주문한 각 종류의 치킨 마릿수
    public static int A, B, C;  // 각각 후라이드, 간장, 양념 치킨 선호 병사 수
    public static long answer;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(op(A) + op(B) + op(C));
	}
	
	public static int op(int x){
	    return x <= N ? x : N;
	}
}