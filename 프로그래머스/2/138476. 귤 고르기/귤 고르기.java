import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 크기별 개수 세기
        Map <Integer, Integer> countMap = new HashMap<>();
        for(int x : tangerine){
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }
        
        // 개수 기준 내림차순 정렬
        List <Integer> countList = new ArrayList<>(countMap.values());
        countList.sort(Collections.reverseOrder());
        
        // 개수가 많은 것부터 포함
        int i = 0;
        while(k > 0){
            k -= countList.get(i);
            i++;
        }
        
        answer = i;
        return answer;
    }
}