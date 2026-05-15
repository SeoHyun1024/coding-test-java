import java.math.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        double length = Math.ceil((double) n / 2);
        
        answer = new int[(int) length];
        for(int i = 0; i < length; i++){
            answer[i] = i*2 + 1;
        }        
        return answer;
    }
}