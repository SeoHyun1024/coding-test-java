import java.util.*;

class Solution {
    boolean[] visited;
    ArrayList<Integer> list = new ArrayList<>();
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean[dungeons.length];
        
        dfs(dungeons, k, 0);

        answer = Collections.max(list);
        
        return answer;
    }
    
    public void dfs(int[][] dungeons, int current, int cnt){
        if(cnt > 0){
            list.add(cnt);
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && current >= dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, current - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}