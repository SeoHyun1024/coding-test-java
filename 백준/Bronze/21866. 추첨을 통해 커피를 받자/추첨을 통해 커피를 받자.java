import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] scores;
    public static int total_score;
    public static String result;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    scores = new int[9];
	    total_score = 0;
	    result = "none";
	    
	    for (int i = 0; i < scores.length; i++){
	        int max_score = ((i/2) + 1) * 100;  //  문제 최대 점수 설정
	        
	        scores[i] = Integer.parseInt(st.nextToken());   //  학생 점수 입력
	        total_score += scores[i];
	        
	        if (scores[i] > max_score) result = "hacker";
	    }
	    
	    // 총 점수가 100점 이상이라면 당첨
	    if (result != "hacker") result = (total_score >= 100) ? "draw" : "none";
	    
	    
	    
	    System.out.print(result);
	}
}