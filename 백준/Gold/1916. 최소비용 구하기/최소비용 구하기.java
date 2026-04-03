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
    
    static int N, M;   // 도시, 버스 개수
    static int start, depart;
    static final long INF = Long.MAX_VALUE;
    static List<Edge>[] graph;
    static long[] dist;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	     
	    N = Integer.parseInt(br.readLine());
	    M = Integer.parseInt(br.readLine());
	    
	    graph = new ArrayList[N + 1];
	    dist = new long[N + 1];
	    
	    // graph 초기화
	    for (int i = 1; i <= N; i++){
	        graph[i] = new ArrayList<>();
	    }
	    
	    // graph 입력
	    for (int i = 0; i < M; i++){
	        st = new StringTokenizer(br.readLine());
	        int from = Integer.parseInt(st.nextToken());
	        int to = Integer.parseInt(st.nextToken());
	        int cost = Integer.parseInt(st.nextToken());
	        
	        graph[from].add(new Edge(to, cost));
	    }
	    
	    // 출발지, 도착지 입력
	    st = new StringTokenizer(br.readLine());
	    start = Integer.parseInt(st.nextToken());
	    depart = Integer.parseInt(st.nextToken());
	    
	    dijkstra(start);

	    System.out.println(dist[depart]);
	}
	
	static public void dijkstra(int start){
	    // dist 초기화
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
	}
}