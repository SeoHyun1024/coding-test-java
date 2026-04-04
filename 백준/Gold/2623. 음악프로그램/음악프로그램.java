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
        N = Integer.parseInt(st.nextToken());   // 가수의 수
        M = Integer.parseInt(st.nextToken());   // 보조 PD 수
        
        graph = new ArrayList[N + 1];
        indegree = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());   // 보조 PD가 담당한 가수의 수
            
            List<Integer> singers = new ArrayList<>();
            
            for(int j = 0; j < n; j++){
                singers.add(Integer.parseInt(st.nextToken()));
            }
            
            for(int j = 0; j < n - 1; j++){
                int from = singers.get(j);
                int to = singers.get(j + 1);
                
                graph[from].add(to);
                indegree[to]++;   
            }
        }
        
        List<Integer> result = topologySort();
        
        if(result.size() != N) result = Arrays.asList(0);
        
        StringBuilder sb = new StringBuilder();
        
        for(int r : result){
            sb.append(r).append('\n');
        }
        
        System.out.print(sb);
        
	}
	
	// 위상정렬 함수
	public static List<Integer> topologySort(){
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 1; i <= N; i++){
            // 간선이 없으면 큐에 삽입
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int cur = q.poll();
            result.add(cur);
            
            for(int next : graph[cur]){
                indegree[next]--;
                if(indegree[next] == 0){
                    q.offer(next);
                }
            }
        }
        
        return result;
	}
}