import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
                
        
        for(int i = 1; i <= citations.length; i++){
            int cnt = i;
            for(int j : citations){
                if(i <= j) cnt--;
            }
            if(cnt <= 0) answer = i;
        }
                
        return answer;
    }
}