import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    // 간선 정의
    static class Edge{
        int to;
        int cost;
        
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    
    static int V, E;
    static int start;
    static List<Edge>[] graph;
    static long[] dist;
    static final long INF = Long.MAX_VALUE;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st ;
	    
	    st = new StringTokenizer(br.readLine());
	    V = Integer.parseInt(st.nextToken());   // 정점 갯수
	    E = Integer.parseInt(st.nextToken());   // 간선 갯수
	    
	    start = Integer.parseInt(br.readLine());   // 시작 정점 번호
	    
	    graph = new ArrayList[V + 1];
	    dist = new long[V + 1];
	    
	    // 그래프 초기화
	    for(int i = 1; i <= V; i++){
	        graph[i] = new ArrayList<>();
	    }
	    
	    // 그래프 입력
	    for(int i = 0; i < E; i++){
	        st = new StringTokenizer(br.readLine());
	        // u -> v 가중치 w인 간선 추가
	        int u = Integer.parseInt(st.nextToken());
	        int v = Integer.parseInt(st.nextToken());
	        int w = Integer.parseInt(st.nextToken());
	        
	        graph[u].add(new Edge(v, w));
	    }
	    
	    dijkstra(start);
	    
	    StringBuilder sb = new StringBuilder();
	    for(int i = 1; i <= V; i++){
	        if(dist[i] == INF) sb.append("INF\n");
	        else sb.append(dist[i]).append("\n");
	    }
	    System.out.print(sb);
	}
	
	public static void dijkstra(int start){
	    // dist 배열 초기화
	    Arrays.fill(dist, INF);
	    dist[start] = 0;
	    
	    PriorityQueue<Edge> pq = new PriorityQueue<>((a,b) -> Long.compare(a.cost, b.cost));
	    pq.offer(new Edge(start, 0));
	    
	    while(!pq.isEmpty()){
	        Edge now = pq.poll();
	        
	        int current = now.to;
	        long cost = now.cost;
	        
	        if(cost > dist[current]) continue;
	        
	        for(Edge next : graph[current]){
	            long nextCost = cost + next.cost;
	            
	            if(nextCost < dist[next.to]){
	                dist[next.to] = nextCost;
	                pq.offer(new Edge(next.to, (int) nextCost));
	            }
	        }
	    }
	   
	}
}