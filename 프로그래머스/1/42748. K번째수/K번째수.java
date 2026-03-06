import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int x = 0;
        for(int[] c : commands){            
            int i = c[0], j = c[1], k = c[2];
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(arr);
            answer[x] = arr[k-1];
            x++;
        }
            
        return answer;
    }
}