import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class Graph {
        int v;  // 노드 갯수
        LinkedList<Integer> adj[];  // 인접 리스트
        boolean[] visited;  // 방문했는지 확인

        // 생성자 정의
        public Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            visited = new boolean[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
                visited[i] = false; // 방문안함으로 초기화
            }
        }

        // 간선 추가
        void addEdge(int v, int w) {
            adj[v].add(w);  // 노드 연결
            adj[w].add(v);
        }

        // DFS 탐색
        void DFS(int v) {
            visited[v] = true;   // 방문함으로 변경

            Iterator<Integer> it = adj[v].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    DFS(n);
                }
            }
        }

        // 연결요소 찾기 함수
        int findCC() {
            int cc = 0;

            for (int i = 0; i < v; i++) {
                if (!visited[i]) {  // 방문 안한 노드이면 DFS 탐색 후 카운트
                    DFS(i);
                    cc++;
                }
            }

            return cc;
        }

    }

    public static void main(String[] args) throws IOException {
        int N, M;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Graph graph = new Graph(N);
        // 노드와 간선 입력
        for (int i = 0; i < M; i++) {
            int v, w;
            line = br.readLine();
            st = new StringTokenizer(line);
            v = Integer.parseInt(st.nextToken()) - 1;
            w = Integer.parseInt(st.nextToken()) - 1;

            graph.addEdge(v, w);    // 간선 추가
        }

        int result = graph.findCC();
        System.out.println(result);
    }
}