import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    static int count = 0;   // Connected Components 갯수
    
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

        void addEdge(int v, int w) {
            adj.get(v).add(w);  // 간선 추가
        }

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

        void findCC() {
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    DFS(i);
                    count++;
                }

            }
        }
    }

    public static int solution(int n, int[][] computers) {
        Graph graph = new Graph(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    graph.addEdge(i, j);
                }
            }
        }

        graph.findCC();
        return count;
    }
}