import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static long[] trees;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken()); // 나무 개수
	    M = Integer.parseInt(st.nextToken()); // 가져갈 나무 길이
	    
	    // 나무 높이 입력
	    trees = new long[N];
	    StringTokenizer st1 = new StringTokenizer(br.readLine());
	    for (int i = 0; i < N; i++){
	        trees[i] = Long.parseLong(st1.nextToken());
	    }
	    // 오름 차순 정렬
	    Arrays.sort(trees);
	    
	    long left = 1, right = trees[N - 1];
	    long answer = 0;
	    while(left <= right){
	        long mid = (left + right) / 2;
	        if (measureTreeLength(mid) < M) {
	            right = mid - 1;
	        }
	        else{
	            answer = mid;
	            left = mid + 1;  
	        } 
	    }
	    System.out.println(answer);
	}
	
	// 자른 나무 길이 반환
	public static long measureTreeLength(long x){
	    long treeLength = 0;
	    for (long tree : trees){
	        if (tree > x) treeLength += tree - x;   // 나무 길이가 높이보다 작을때만 길이에 추가
	    }
	    return treeLength;
	}
}
