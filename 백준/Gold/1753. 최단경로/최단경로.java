import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static long[] distance;
    public static int[] prev;
    public static List<List<Edge>> graph;
    public static int V, E, K;
    
    // 간선 클래스 정의
    static class Edge{
        int destination;
        int weight;
        
        Edge(int destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // V, E 입력
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    V = Integer.parseInt(st.nextToken());   // 노드 갯수
	    E = Integer.parseInt(st.nextToken());   // 간선 갯수
	    K = Integer.parseInt(br.readLine());   // 시작 정점 번호
	    
	    graph = new ArrayList<>(V + 1); // 그래프 초기화
	    
	    for (int i = 0; i <= V; i++) graph.add(new ArrayList<>());
	    
	    // 배열 초기화
        distance = new long[V + 1];
        prev = new int[V + 1];
        Arrays.fill(distance, Long.MAX_VALUE / 4);
        Arrays.fill(prev, -1);
        
        for (int i = 0; i < E; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st1.nextToken()) - 1;
            int v = Integer.parseInt(st1.nextToken()) - 1;
            int w = Integer.parseInt(st1.nextToken());
            
            graph.get(u).add(new Edge(v, w));   // 간선 추가
        }
        
        dijkstra(K - 1);
        
        for (int i  = 0; i < V; i++){
            if (distance[i] == Long.MAX_VALUE / 4){
                System.out.println("INF");
            }else{
                System.out.println(distance[i]);
            }
        }
	}
	
	public static void dijkstra(int start){
	    PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
	    distance[start] = 0;
	    pq.offer(new long[]{0L, start});
	    
	    while(!pq.isEmpty()){
	        long[] cur = pq.poll();
	        long d = cur[0];
	        int u = (int) cur[1];
	        
	        if (d != distance[u]) continue; // 더 좋은 경우로 갱신된 경우 스킵
	        
	        for (Edge e : graph.get(u)){
	            int v = e.destination;
	            long nd = d + e.weight; // 가중치 합산하여 새로운 거리 저장
	            
	            if (nd < distance[v]){
	                distance[v] = nd;
	                prev[v] = u;
	                pq.offer(new long[]{nd, v});
	            }
	        }
	    }
	}
}