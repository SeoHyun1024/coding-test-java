import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] coordinates = new int[N];
        Set<Integer> coordinatesSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coordinates[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : coordinates) coordinatesSet.add(x); // 중복 제거하여 추가

        // Set을 리스트로 변환
        List<Integer> list = new ArrayList<>(coordinatesSet);
        Collections.sort(list); // 오름 차순 정렬

        Map<Integer, Integer> compressed = new HashMap<>(); // 압축 좌표
        for (int i = 0; i < list.size(); i++) {
            compressed.put(list.get(i), i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 결과 출력
        for (int i = 0; i < N; i++) {
            int x = compressed.get(coordinates[i]);
            bw.write(x + " ");
        }
        bw.flush();
        br.close();
    }
}
