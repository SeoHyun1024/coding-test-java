import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, C;
    static int[] Houses;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken()); // 집 개수
	    C = Integer.parseInt(st.nextToken()); // 공유기 개수
	    
	    // 집들 좌표 입력
	    Houses = new int[N];
	    for (int i = 0; i < N; i++) Houses[i] = Integer.parseInt(br.readLine());
	    
	    // 오름 차순 정렬
	    Arrays.sort(Houses);
	    
	    
	    int left = 1, right = Houses[N - 1] - Houses[0];
	    int answer = 0;
	    
	    while(left <= right){
	        int mid = (left + right) / 2;
	        if (!isPossible(mid)){
	            right = mid - 1;
	        }else{
	            answer= mid;
	            left = mid + 1;
	        }
	    }
	    System.out.println(answer);
	}
	
	public static boolean isPossible(int K){
	    int count = 1;
	    int lastPosition = Houses[0];
	    
	    for (int i = 1; i < N; i++){
	        if (Houses[i] - lastPosition >= K) {
	            count++;
	            lastPosition = Houses[i];
	        }
	    }
	    return count >= C;
	}
	
}
