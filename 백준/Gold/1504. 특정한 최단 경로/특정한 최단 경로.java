import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

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
    
    static int N, E;    // 정점, 간선 개수
    static final int start = 1;
    static int V1, V2;
    static List<Edge>[] graph;
    static long[] dist;
    static final long INF = Long.MAX_VALUE / 3;
    
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    E = Integer.parseInt(st.nextToken());
	    
	    graph = new ArrayList[N + 1];
	    dist = new long[N + 1];
	    
	    // graph 초기화 
	    for(int i = 1; i <= N; i++){
	        graph[i] = new ArrayList<>();
	    }
	    
	    // graph 입력
	    for(int i = 0; i < E; i++){
	        st = new StringTokenizer(br.readLine());
	        int from = Integer.parseInt(st.nextToken());
	        int to = Integer.parseInt(st.nextToken());
	        int distance = Integer.parseInt(st.nextToken());
	        
	        // 양방향 간선 
	        graph[from].add(new Edge(to, distance));
	        graph[to].add(new Edge(from, distance));
	    }
	    
	    st = new StringTokenizer(br.readLine());
	    V1 = Integer.parseInt(st.nextToken());
	    V2 = Integer.parseInt(st.nextToken());
	    
	    long d1 = dijkstra(start, V1) + dijkstra(V1, V2) + dijkstra(V2, N);
	    long d2 = dijkstra(start, V2) + dijkstra(V2, V1) + dijkstra(V1, N);
	    
	    long answer = Math.min(d1, d2);
	    answer = answer >= INF ? -1 : answer;
	    
	    System.out.println(answer);
	}
	
	public static long dijkstra(int start, int depart){
	    Arrays.fill(dist, INF);
	    dist[start] = 0;
	    
	    PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));
	    pq.offer(new Edge(start, 0));
	    
	    while(!pq.isEmpty()){
	        Edge now = pq.poll();
	        
	        int cur = now.to;
	        int cost = now.cost;
	        
	        if(cost > dist[cur]) continue;
	        
	        for(Edge next : graph[cur]){
	            long nextCost = cost + next.cost;
	            
	            if(nextCost < dist[next.to]){
	                dist[next.to] = nextCost;
	                pq.offer(new Edge(next.to, (int) nextCost));
	            }
	        }
	    }
	    
	    return dist[depart];
	}
}