import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static class Graph {
        int v;  // 노드 갯수
        LinkedList<Integer> adj[];  // 인접 리스트
        boolean[] visited;  // 방문했는지 확인
        int[] planted;

        // 생성자 정의
        public Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            visited = new boolean[v];
            planted = new int[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
                visited[i] = false; // 방문안함으로 초기화
            }
        }

        // 인접 노드 추가
        void addAdjNode(int x, int y) {
            int position = x + y * M;
            int[] direction = {-M, M, -1, 1};   // 방향 리스트

            planted[position] = 1;  // 배추 심었다고 표시

            for (int i : direction) {
                int adjPosition = position + i;
                if (adjPosition >= 0 && adjPosition < M * N && planted[position + i] == 1) {
                    if (adjPosition % M == 0 && i == 1 || adjPosition % M == M - 1 && i == -1) continue;
                    addEdge(position, position + i);
                }
            }
        }

        // 간선 추가
        void addEdge(int v, int w) {
            adj[v].add(w);  // 노드 연결
            adj[w].add(v);
        }

        // 연결요소 찾기 함수
        int findCC() {
            int cc = 0;

            for (int i = 0; i < v; i++) {
                if (!visited[i] && planted[i] == 1) {  // 방문 안한 노드이면 DFS 탐색 후 카운트
                    BFS(i);
                    cc++;
                }
            }

            return cc;
        }

        // BFS 탐색
        void BFS(int v) {
            LinkedList<Integer> queue = new LinkedList<>();

            visited[v] = true;  //  방문했다고 표시
            queue.add(v);   // 큐에 추가

            while (!queue.isEmpty()) {
                v = queue.poll();   // 방문한 노드를 큐에서 추출하고 출력

                Iterator<Integer> it = adj[v].listIterator();
                while (it.hasNext()) {    // 인접 노드 전부 탐색
                    int n = it.next();
                    if (!visited[n]) {   // 방문하지 않은 노드들은 표시
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    static int T;   // TEST CASE
    static int M, N, K; // 가로, 세로, 배추 갯수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());    // 테스트 케이스 갯수 입력

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            Graph graph = new Graph(M * N);

            // 노드와 간선 입력
            for (int j = 0; j < K; j++) {
                int x, y;
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                graph.addAdjNode(x, y);    // 간선 추가
            }

            int result = graph.findCC();
            System.out.println(result); // 연결 요소 출력
        }


    }
}

