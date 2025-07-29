import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[][] A, B, result;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());

	    A = new int[N][M];
	    B = new int[N][M];
	    result = new int[N][M];
	    
	    // 2차원 배열 입력 (A)
	    for (int i = 0; i< N; i++){
	        StringTokenizer st1 = new StringTokenizer(br.readLine());
	        for (int j = 0; j < M; j++){
	            A[i][j] = Integer.parseInt(st1.nextToken());
	        }
	    }
	    // 2차원 배열 입력 (B)
	    for (int i = 0; i< N; i++){
	        StringTokenizer st2 = new StringTokenizer(br.readLine());
	        for (int j = 0; j < M; j++){
	            B[i][j] = Integer.parseInt(st2.nextToken());
	        }
	    }
	    
	    // 행렬 연산 (A + B)
	    for (int i = 0; i< N; i++){
	        for (int j = 0; j < M; j++){
	            result[i][j] = A[i][j] + B[i][j];
	        }
	    }
	    
	    // 행렬 출력
	    for (int i = 0; i< N; i++){
	        for (int j = 0; j < M; j++){
	            System.out.print(result[i][j] + " ");
	        }System.out.println();
	    }
	}
}