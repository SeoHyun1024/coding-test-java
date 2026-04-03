import java.util.*;
import java.math.*;

class Solution {
    // 간선 class 정의
    public static class Edge{
        int to;
        int cost;
        
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    
    // 양방향
    List<Edge>[] graph;
    int[] dist;
    final int INF = Integer.MAX_VALUE;
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        
        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] f : fares){
            int from = f[0];
            int to = f[1];
            int cost = f[2];
            
            // 양방향 간선 추가
            graph[from].add(new Edge(to, cost));
            graph[to].add(new Edge(from, cost));
        }
        
        // s에서 출발하는 최단거리 계산
        int[] sDist = Arrays.copyOf(dijkstra(s), n + 1);
        
        // 각자 따로 갈 경우
        int independent = dist[a] + dist[b];
        
        // 각각 a, b에서 출발하는 최단거리 계산
        int[] aDist = Arrays.copyOf(dijkstra(a), n + 1);
        int[] bDist = Arrays.copyOf(dijkstra(b), n + 1);
                          
        // 합승을 할 경우
        int together = INF;                
        for(int i = 1; i <= n; i++){                                                
            together = Math.min(sDist[i] + aDist[i] + bDist[i], together);           
        }               
        
        answer = Math.min(together, independent);
        
        return answer;
    }
    
    public int[] dijkstra(int start){
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.cost, b.cost));
        pq.offer(new Edge(start, 0));
        
        while(!pq.isEmpty()){
            Edge now = pq.poll();
            int cur = now.to;
            int cost = now.cost;
            
            if(cost > dist[cur]) continue;
            
            for(Edge next : graph[cur]){
                int nextCost = cost + next.cost;
                
                if(nextCost < dist[next.to]){
                    dist[next.to] = nextCost;
                    pq.offer(new Edge(next.to , nextCost));
                }
            }
        }
        
        return dist;   // 가지못하는 경우는 없음
    }
}