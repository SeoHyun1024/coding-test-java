import java.util.*;

class Solution {
    static class Edge{
        int to;
        int cost;
        
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    
    List<Edge>[] graph;
    long[] dist;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        graph = new ArrayList[n + 1];
        dist = new long[n + 1];
        
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < costs.length; i++){
            // 양방향
            graph[costs[i][0]].add(new Edge(costs[i][1], costs[i][2]));
            graph[costs[i][1]].add(new Edge(costs[i][0], costs[i][2]));
        }
        
        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        
        int count = 0;
        
        pq.add(new Edge(0, 0));
        
        while(!pq.isEmpty()){
            Edge current = pq.poll();
            
            if(visited[current.to]){
                continue;
            }
            
            visited[current.to] = true;
            answer += current.cost;
            count++;
            
            if(count == n){
                break;
            }
            
            for(Edge next : graph[current.to]){
                if(!visited[next.to]){
                    pq.add(next);
                }
            }
        }
                        
        return answer;
    }
}