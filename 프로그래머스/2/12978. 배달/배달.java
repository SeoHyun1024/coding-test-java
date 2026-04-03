import java.util.*;

class Solution {
    // 간선 class 정의
    static class Edge{
        int to;
        int cost;
        
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    
    final int start = 1;
    final long INF = Long.MAX_VALUE;
    static List<Edge>[] graph; //  마을 정보를 저장할 그래프
    static long[] dist;    // 마을별 최소비용 저장할 배열
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        graph = new ArrayList[N + 1];   //  그래프 정의
        dist = new long[N + 1];    //  dist 정의
        
        // 그래프 초기화
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        // 그래프 입력
        for(int[] r : road){            
            int from = r[0];
            int to = r[1];
            int time = r[2];
            
            // 무방향 그래프
            graph[from].add(new Edge(to, time));
            graph[to].add(new Edge(from, time));
        }
        
        dijkstra(start);
        
        for(long d : dist){            
            if (d <= K) answer++;
        }       

        return answer;
    }
    
    public void dijkstra(int start){
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));
        pq.offer(new Edge(start, 0));
        
        while(!pq.isEmpty()){
            Edge now = pq.poll();
            
            int cur = now.to;
            int cost = now.cost;
            
            if (cost > dist[cur]) continue;
            
            for(Edge next : graph[cur]){
                long nextCost = cost + next.cost;
                
                if(nextCost < dist[next.to]){
                    dist[next.to] = nextCost;
                    pq.offer(new Edge(next.to, (int) nextCost));
                }
            }
        }
    }
}