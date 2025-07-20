import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static int N, M;   // 컴퓨터 갯수, 간선 갯수
    static int count = 0;   // Connected Components 갯수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        Graph graph = new Graph(N);

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int v = Integer.parseInt(input[0]) - 1;
            int w = Integer.parseInt(input[1]) - 1;
            graph.addEdge(v, w); // 간선 추가
        }

        graph.DFS(0);   // 1번부터 탐색
        graph.countVirusCom();  // 바이러스 걸린 컴퓨터 갯수

        System.out.println(count);
    }

    static class Graph {
        int n;  // 노드 갯수
        boolean[] visited;// 방문했는지
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // 생성자 정의
        Graph(int n) {
            this.n = n;
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                visited[i] = false;
                adj.add(new ArrayList<>());
            }
        }

        // 간선 추가 함수
        void addEdge(int v, int w) {
            adj.get(v).add(w);  // 간선 추가
            adj.get(w).add(v);
        }

        // DFS 탐색
        void DFS(int v) {
            visited[v] = true;

            Iterator<Integer> it = adj.get(v).iterator();
            while (it.hasNext()) {
                int next = it.next();
                if (!visited[next]) {
                    DFS(next);
                }
            }
        }

        // 바이러스가 걸린 컴퓨터 카운트 (1번 컴퓨터 제외)
        void countVirusCom() {
            for (int i = 1; i < n; i++) {
                if (visited[i]) count++;
            }
        }
    }
}