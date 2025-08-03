import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] lectureLengths;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken()); // 강의 개수
	    M = Integer.parseInt(st.nextToken()); // BlueLay 수
	    
	    // 강의 길이 입력
	    lectureLengths = new int[N];
	    StringTokenizer st1 = new StringTokenizer(br.readLine());
	    for (int i = 0; i < N; i++){
	        lectureLengths[i] = Integer.parseInt(st1.nextToken());
	    }
	    
	    // 이진 탐색
	    int left = Arrays.stream(lectureLengths).max().getAsInt(), right = Arrays.stream(lectureLengths).sum();
	    int answer = 0;
	    
	    while(left <= right){
	        int mid = (left + right) / 2;
	        if (isPossible(M , mid)) {
	            answer = mid;
	            right = mid - 1;
	        }
	        else{
	            left = mid + 1;  
	        } 
	       //System.out.println("left : " + left + " right : " + right + " mid : " + mid + " answer : " + answer);
	    }
	    System.out.println(answer);
	}
	
	// length 저장해서 blueLay 갯수보다 작거나 같은지 확인
	public static boolean isPossible(int M, int length){
	    int count = 1;
	    int remain = length;    // 남은 저장공간
	    
	    for (int x : lectureLengths){
	        if (remain < x) {   // 저장할 공간 없으면
	            count++;    // BlueLay 갯수 증가
	            remain = length;
	        }
	        remain -= x;
	    }
	    
	    return count <= M;
	}
}
