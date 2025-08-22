import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;
    public static List<List<Integer>> graph = new ArrayList<>();
    public static boolean[] visited;
    public static int[] distance;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    graph = new ArrayList<>();
	    visited = new boolean[N + 1];
	    distance = new int[N + 1];
	    for(int i = 0; i <= N; i++) graph.add(new ArrayList<>());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 1; i <= N; i++){
	        int x = Integer.parseInt(st.nextToken());
	        if (x>0){
	            for (int j = 1; j <= x; j++) {
	                if (i + j <= N) graph.get(i).add(i+j);  // 간선 추가
	            }
	        }
	    }
	    
	    bfs(1);
	    
	    System.out.println(distance[N]);
	}
	
	public static void bfs(int start){
	    Queue<Integer> q = new LinkedList<>();
	    q.offer(start);
	    visited[start] = true;
	    Arrays.fill(distance, -1);
	    distance[start] = 0;
	    
	    // 큐가 빌 때까지 반복
	    while(!q.isEmpty()){
	        int current = q.poll();
	        visited[current]= true;
	        
	        for (int next : graph.get(current)){
	            if (!visited[next]){
	                visited[next] = true;  // 방문 처리
    	            distance[next] = distance[current] + 1; // 거리 1 추가
    	            q.offer(next);  // 큐에 인접 노드 삽입    
	            }
	        }
	    }
	}
}