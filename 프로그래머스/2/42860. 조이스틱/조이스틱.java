import java.math.*;
import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1; // 기본 동선(오른쪽으로 쭉) 가면 전체 길이 - 1만큼 이동
        
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            
            answer += minUpDown(c);
            
            int next = i + 1;            
            while(next < name.length() && name.charAt(next) == 'A'){
                next++;
            }
            
            move = Math.min(move, i * 2 + (name.length() - next));    // 0 -> i -> 0 -> 반대로 도는 동선
            move = Math.min(move, (name.length() - next) * 2 + i);    // 0 -> 반대로 돌아서 next -> len -> 반대로 돌아서 0 -> i
        }
        
        answer += move;
        
        return answer;
    }
    
    public int minUpDown(char to){
        int a = Math.abs(to - 'A');
        int b = 26 - a;
        
        return Math.min(a, b);
    }
}