import java.util.*;

class Solution {    
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(numbers, 0, 0, target);
        answer = cnt;
        
        return answer;
    }
    
    void dfs(int[] numbers, int idx, int sum, int target){
        if(idx >= numbers.length){
            if(sum == target){
                cnt++;
            }
            return;
        }
        
        dfs(numbers, idx + 1, sum + numbers[idx], target);
        dfs(numbers, idx + 1, sum - numbers[idx], target);
    }
}