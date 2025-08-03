import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n;
    static int[] Ai;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    n = Integer.parseInt(br.readLine()); // 일 개수
	    
	    // 마감기한 입력
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    Ai = new int[n];
	    for (int i = 0; i < n; i++) Ai[i] = Integer.parseInt(st.nextToken());
	    
	    // 오름 차순 정렬
	    Arrays.sort(Ai);
	    
        int min = Arrays.stream(Ai).min().getAsInt();
	    int left = 1, right = min;
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
	
	public static boolean isPossible(int n){
	    int total = 0;
	    
	    for (int i : Ai){
	        total += n;
	        if (total > i) return false;
	    }
	    return true;
	}
	
}
