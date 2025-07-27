import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N, M;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() >= M) {
                if (words.containsKey(s)) {
                    words.put(s, words.get(s) + 1); // 단어가 이미 존재하면 카운트 +1
                } else {
                    words.put(s, 1);    // 단어가 존재하지 않을 경우 1로 초기화
                }
            }
        }

        // Entry 리스트로 변환
        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());

        // count 기준으로 내림차순 정렬
        list.sort((e1, e2) -> {
            int cmp1 = Integer.compare(e2.getValue(), e1.getValue()); // 1차: count 내림차순
            if (cmp1 != 0) return cmp1;

            int cmp2 = Integer.compare(e2.getKey().length(), e1.getKey().length()); // 2차: 단어 길이 내림차순
            if (cmp2 != 0) return cmp2;

            return e1.getKey().compareTo(e2.getKey());  // 사전순
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 결과 출력
        for (Map.Entry<String, Integer> entry : list) {
            bw.write(entry.getKey());
            bw.newLine();

        }
        bw.flush();
        br.close();
    }
}
