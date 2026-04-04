import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static List<Integer>[] graph;
    static int[] indegree;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 과목의 수
        M = Integer.parseInt(st.nextToken());   // 선수 조건 수
        
        graph = new ArrayList[N + 1];
        indegree = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            
            graph[from].add(to);
            indegree[to]++;   
        }
        
        int[] result = topologySort();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= N; i++){
            sb.append(result[i]).append(' ');
        }
        
        System.out.print(sb);
        
	}
	
	// 위상정렬 함수
	public static int[] topologySort(){
        Queue<Integer> q = new ArrayDeque<>();
        int[] result = new int[N + 1];
        Arrays.fill(result, 1);
        
        for(int i = 1; i <= N; i++){
            // 간선이 없으면 큐에 삽입
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int next : graph[cur]){
                result[next] = Math.max(result[next], result[cur] + 1);
                
                indegree[next]--;
                if(indegree[next] == 0){
                    q.offer(next);
                }
            }
        }
        
        return result;
	}
}