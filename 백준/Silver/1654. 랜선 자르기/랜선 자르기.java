import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int K, N;
    static int[] cables;
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    K = Integer.parseInt(st.nextToken());
	    N = Integer.parseInt(st.nextToken());
	    
	    // 랜선 길이 입력
	    cables = new int[K];
	    for (int i = 0; i < K; i++){
	        cables[i] = Integer.parseInt(br.readLine());
	    }
	    // 오름 차순 정렬
	    Arrays.sort(cables);
	    
	    long left = 1, right = cables[K - 1];
	    long answer = 0;
	    while(left <= right){
	        long mid = (left + right) / 2;
	        if (countCableNum(mid) < N) {
	            right = mid - 1;
	        }
	        else{
	            answer = mid;
	            left = mid + 1;  
	        } 
	    }
	    
	    System.out.println(answer);
	}
	
	// 자를 수 있는 케이블 개수 반환
	public static long countCableNum(long x){
	    long count = 0;
	    for (int cable : cables){
	        count += cable / x;
	    }
	    return count;
	}
}

// 1. N은 랜선의 최솟값보다 작아야 한다. 이 경우에는 457보다 클 수 없다.
// 2. 457을 right 로 하고 이진 탐색을 진행하면 됨.
// 제한 조건 : K <= 10^5, N <= 10^6, K <= N, (랜선의 길이) <= 2^32 - 1