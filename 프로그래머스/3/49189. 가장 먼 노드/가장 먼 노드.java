import java.util.*;

class Solution {
    List<Integer>[] graph;
    int[] dist;
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
            dist[i] = -1;
        }
        
        for(int i = 0; i < edge.length; i++){
            int from = edge[i][0];
            int to = edge[i][1];
            
            graph[from].add(to);
            graph[to].add(from);
        }
        
        bfs(1);
        
        int cnt = 0;
        Arrays.sort(dist);
        for(int i = 0; i < dist.length; i++){
            if(dist[dist.length - 1] > dist[i]){
                cnt = dist.length - i - 1;
            }
            
        }
        answer = cnt;
        
        return answer;
    }
    
    void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        dist[start] = 0;
        
        while(!q.isEmpty()){
            int current = q.poll();
            
            for(int next : graph[current]){
                if(dist[next] == -1){
                    dist[next] = dist[current] + 1;
                    q.add(next);
                }
            }
        }
    }
}