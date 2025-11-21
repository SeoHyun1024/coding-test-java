import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
                        
           	//  테스트 케이스 갯수 입력             
            int t = Integer.parseInt(br.readLine());
            
            for(int i = 0; i < t; i++){
                int[] arr = new int[2];
                int N, answer = 0;
                
                st = new StringTokenizer(br.readLine());
                arr[0] = Integer.parseInt(st.nextToken());
                arr[1] = Integer.parseInt(st.nextToken());
                N = Integer.parseInt(st.nextToken());      
                
                while(arr[0] <= N && arr[1] <= N){
                    // 오름 차순 정렬
                    Arrays.sort(arr);
                    arr[0] += arr[1];
                    
                    answer++;
                }
                System.out.println(answer);
            }
		
	}
}