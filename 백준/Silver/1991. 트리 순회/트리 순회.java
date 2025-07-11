import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();  // 마지막 출력할 결과
    static Map<Character, char[]> tree = new HashMap<>();   // tree 생성

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" "); // 공백을 기준으로 split 한 후 String 리스트에 저장
            char root = line[0].charAt(0);
            char left = line[1].charAt(0);
            char right = line[2].charAt(0);
            tree.put(root, new char[]{left, right}); // tree 초기화
        }
        preOrder('A');
        sb.append('\n');
        inOrder('A');
        sb.append('\n');
        postOrder('A');
        System.out.println(sb);
    }

    // 전위 순회
    static void preOrder(char node) {
        if (node == '.') return;    // 노드가 없으면 중단
        sb.append(node);    // 문자열에 추가
        preOrder(tree.get(node)[0]);    // 왼쪽 노드로 이동
        preOrder(tree.get(node)[1]);    // 오른쪽 노드로 이동
    }

    // 중위 순회
    static void inOrder(char node) {
        if (node == '.') return;
        inOrder(tree.get(node)[0]);    // 왼쪽 노드로 이동
        sb.append(node);    // 문자열에 추가
        inOrder(tree.get(node)[1]);   // 오른쪽 노드로 이동
    }

    // 후위 순회
    static void postOrder(char node) {
        if (node == '.') return;    // 노드가 없으면 중단
        postOrder(tree.get(node)[0]);   // 왼쪽 노드로 이동
        postOrder(tree.get(node)[1]);   // 오른쪽 노드로 이동
        sb.append(node);    // 문자열 추가
    }
}
