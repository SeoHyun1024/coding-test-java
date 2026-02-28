import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String c : arr){
            int x = Integer.parseInt(c);
            if(x > max) max = x;
            if(x < min) min = x;
        }
        
        answer =  min + " " + max;
        
        return answer;
    }
}