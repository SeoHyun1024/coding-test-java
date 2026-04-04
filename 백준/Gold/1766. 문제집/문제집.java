import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;    // 문제의 수, 정보의 개수
    static List<Integer>[] graph;   // 그래프
    static int[] indegree;  // 진입 차수
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken());   // 문제(노드) 수
	    M = Integer.parseInt(st.nextToken());   // 정보(간선) 수
	    
	    graph = new ArrayList[N + 1];
	    indegree = new int[N + 1];
	    
	    for(int i = 1; i <= N; i++){
	        graph[i] = new ArrayList<>();
	    }
	    
	    for(int i = 0; i < M; i++){
	        st = new StringTokenizer(br.readLine());
	        int from = Integer.parseInt(st.nextToken());
	        int to = Integer.parseInt(st.nextToken());
	        
	        graph[from].add(to);    // graph에 추가
	        indegree[to]++;   // 선행조건(진입차수) 추가
	    }
	    
	    List<Integer> result = topologySort();
	    
	    for(int r : result){
	        System.out.print(r + " ");
	    }
	}
	    
    public static List<Integer> topologySort(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(a, b));  // 우선순위큐 선언
        List<Integer> result = new ArrayList<>();   // 결과 정수 배열 선언
        
        for(int i = 1; i <= N; i++){
            // 선행조건이 없으면 큐에 삽입
            if(indegree[i] == 0) pq.offer(i);
        }
        
        // 큐가 빌 때까지 진행
        while(!pq.isEmpty()){
            int cur = pq.poll();
            result.add(cur);
            
            for(int next : graph[cur]){
                // 다음 노드의 간선 개수 한개 제거
                indegree[next]--;
                
                if(indegree[next] == 0){
                    pq.offer(next);
                }
            }
        }
        
        return result;
    }
}