import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] A;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정수 입력
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        list = new ArrayList<>();
        for (int i = N - 1; i >= 0; i--) {  // 뒤에서부터 추가
            list.add(A[i], i + 1);  // A 의 값을 index로 해서 list에 원소 추가
        }
        
        // 출력
        for (int i = 0; i < N; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
