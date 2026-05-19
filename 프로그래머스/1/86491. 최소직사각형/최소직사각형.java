import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer= 1;
        int length = sizes.length * 2;  // 가로 세로 개수        
        
        ArrayList<Integer> arrayX = new ArrayList<>();  // 가로 저장배열
        ArrayList<Integer> arrayY = new ArrayList<>();  // 세로 저장배열
        
        for(int[] s : sizes){
            Arrays.sort(s);            
            arrayX.add(s[0]);
            arrayY.add(s[1]);
        }     
                        
        answer = Collections.max(arrayX) * Collections.max(arrayY);
        
        return answer;
    }
}