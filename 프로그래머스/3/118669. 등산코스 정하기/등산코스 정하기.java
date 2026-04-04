import java.util.*;

class Solution {
    // 간선 정의
    public static class Edge{
        int to;
        int intensity;
        
        Edge(int to, int intensity){
            this.to = to;
            this.intensity = intensity;
        }
    }
    
    List<Edge>[] graph;
    int dist[];
    boolean isSummit[];
    final int INF = Integer.MAX_VALUE;
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int[] answer = new int[2];
        
        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        isSummit = new boolean[n + 1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        // 정상인 노드만 표시
        for(int s : summits){
            isSummit[s] = true;
        }
        
        for(int[] p : paths){
            int from = p[0];
            int to = p[1];
            int weight = p[2];
            
            graph[from].add(new Edge(to, weight));
            graph[to].add(new Edge(from, weight));
        }        
        
        dajkstra(gates);
        
        // summits 오름차순 정렬
        Arrays.sort(summits);
        
        int summitNumber = 0;
        int intensity = INF;
        
        // 정상노드에 대한 intensity값 중 최솟값 선택
        for (int summit : summits) {
            if (dist[summit] < intensity) {
                intensity = dist[summit];
                summitNumber = summit;
            }
        }
        
       
        answer[0] = summitNumber;
        answer[1] = intensity;
                
        return answer;
    }
    
    public void dajkstra(int[] gates){
        Arrays.fill(dist, INF);
        
        
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.intensity, b.intensity));
        
        // 입구인 노드를 출발 노드로 설정
        for(int g : gates){
            dist[g] = 0;
            pq.offer(new Edge(g, 0));            
        }
        
        while(!pq.isEmpty()){
            Edge now = pq.poll();
            
            int cur = now.to;
            int intensity = now.intensity;
            
            if(intensity > dist[cur]) continue;
            
            // 정상 노드면 그만
            if(isSummit[cur]) continue;
            
            for(Edge next : graph[cur]){                                                
                // 현재와 다음 노드의 intensity 중 더 큰 값 선택
                int nextIntensity = Math.max(next.intensity, intensity);
                
                if(nextIntensity < dist[next.to]){
                    dist[next.to] = nextIntensity;
                    pq.offer(new Edge(next.to, nextIntensity));
                }
            }
        }
        
    }
}