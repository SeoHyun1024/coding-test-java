import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static List<List<Integer>> graph = new ArrayList<>();
    public static boolean[] visited;
    public static int N, M;
    public static int cnt;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    M = Integer.parseInt(br.readLine());
	    
	    // graph 초기화
	    cnt = 0;
	    for(int i = 0; i < N + 1; i++) graph.add(new ArrayList<>());
	    for (int i =0; i < M; i++){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        
	        graph.get(a).add(b);
	        graph.get(b).add(a);
	    }
	    visited = new boolean[N + 1];
	    bfs(1);
	    System.out.println(cnt);   
	}
	
	public static void bfs(int start){
	    Queue<Integer> q = new LinkedList<>();
	    q.offer(start); //  시작 노드 삽입
	    visited[start] = true;  //  방문처리
	    
	    while(!q.isEmpty()){
	        int current = q.poll(); //  현재 노드 꺼내기
	        
	        // 인접 노드 탐색
	        for (int next : graph.get(current)){
	            // 방문 안했으면
	            if (!visited[next]) {
	                if (current == 1) { // 상근이 친구, 친구의친구만 탐색
	                    q.offer(next);  //  큐에 삽입
	                }
	                visited[next] = true;   // 방문처리
	                cnt++;
	            }
	        }
	        
	    }
	}
}