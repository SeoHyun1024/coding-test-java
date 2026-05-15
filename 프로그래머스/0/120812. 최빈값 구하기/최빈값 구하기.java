import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxLength = 1;
        int tmp = 1;
        
        // 오름차순 정렬
        Arrays.sort(array);
        
        // 배열 길이 1일 때
        if(array.length == 1) answer = array[0];
        
        // 배열길이 1보다 클 때
        if(array.length > 1){
            for(int i = 1; i < array.length ; i++){            
                if (array[i] == array[i - 1]){
                    tmp++;
                    if (tmp > maxLength) {
                        maxLength = tmp;
                        answer = array[i];
                    }else if (tmp == maxLength) answer = -1;
                } else{
                    tmp = 1;  
                    if(tmp == maxLength) answer = -1;
                }
            }    
        }        
        
        return answer;
    }
}