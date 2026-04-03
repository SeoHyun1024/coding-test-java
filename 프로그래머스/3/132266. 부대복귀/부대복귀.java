import java.util.*;

class Solution {
    public class Edge{
        int to;
        int cost;
        
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    
    final int INF = Integer.MAX_VALUE;
    List<Edge>[] graph;
    int[] dist;
    
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        
        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] r : roads){
            int from = r[0];
            int to = r[1];
            int distance = 1;   // 거리 1로 통일
            
            // 왕복 가능
            graph[from].add(new Edge(to, distance));
            graph[to].add(new Edge(from, distance));
        }
        
        dijkstra(destination);
        
        for(int i = 0; i < sources.length; i++){
            int result  = dist[sources[i]];
            
            answer[i] = result >= INF ? -1 : result;
        }
        
        return answer;
    }
    
    public void dijkstra(int start){
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
                    pq.offer(new Edge(next.to, (int) nextCost));
                }
            }
        }        
    }
}