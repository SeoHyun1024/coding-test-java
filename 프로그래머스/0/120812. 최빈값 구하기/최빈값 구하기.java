import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            
            if (count > maxCount){
                answer = number;
                maxCount = count;
            }else if (count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        
        if(array.length == 1) answer = array[0];
        
        return answer;
    }
}