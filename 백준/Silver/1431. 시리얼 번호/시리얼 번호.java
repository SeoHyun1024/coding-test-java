import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Map<char[], Integer> serials = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int sum =0;
            for (int j =0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= '0' && c <= '9') {
                    sum += c - '0';
                }
            }
           serials.put(s.toCharArray(), sum);
        }

        // Entry 리스트로 변환
        List<Map.Entry<char[], Integer>> list = new ArrayList<>(serials.entrySet());

        // 리스트 정렬
        list.sort((e1, e2) -> {
            int cmp1 = Integer.compare(e1.getKey().length, e2.getKey().length); // 1차: serial 넘버 길이 오름차순
            if (cmp1 != 0) return cmp1;

            int cmp2 = Integer.compare(e1.getValue(), e2.getValue()); // 2차: 시리얼 각 자리 합 오름차순
            if (cmp2 != 0) return cmp2;

            return Arrays.compare(e1.getKey(),e2.getKey());  // 3차 : 사전순
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 결과 출력
        for (Map.Entry<char[], Integer> entry : list) {
            bw.write(entry.getKey());
            bw.newLine();
        }
        bw.flush();
        br.close();
    }
}
