import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N, M;
    public static int[] cards;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());   // 카드 갯수
	    M = Integer.parseInt(st.nextToken());   // 타겟 넘버
	    
	    StringTokenizer st1 = new StringTokenizer(br.readLine());
	    cards = new int[N];
	    for (int i = 0; i < N; i++){
	        cards[i] = Integer.parseInt(st1.nextToken());   // 카드 숫자
	    }
	    
	    Arrays.sort(cards);
	    int answer = 0;
	    for (int i = 0; i < N - 2; i++){
	        for (int j = i + 1; j < N - 1; j++){
	            for (int k = j + 1; k < N; k++){
	                int number = cards[i] + cards[j] + cards[k];
	                if (number <= M && answer < number){
	                    answer = number;
	                }
	            }
	        }
	    }
	    
	    System.out.println(answer);
	 
	}
}