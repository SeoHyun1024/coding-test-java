import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);  // 시작 정수 (N) 입력
        int M = Integer.parseInt(input.split(" ")[1]);  // 끝 정수 (M) 입력

        int count = 0;  // 언더 프라임 갯수
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = N; i <= M; i++) {
            int num = i, j = 1;
            map.put(i, new ArrayList<>());  // map 초기화

            while (num > 1) {
                j++;
                if (num % j == 0) { // 나눠 떨어지면
                    num /= j;
                    map.get(i).add(j);  // map 에 추가
                    j = 1;  // j 값 초기화
                }
            }
        }

        // 언더프라임인 정수 갯수 카운트
        for (int i = N; i <= M; i++) {
            int size = map.get(i).size();
            if (isPrime(size)) count++;
        }

        // 갯수 출력
        System.out.println(count);
    }

    // 소수인지 판별하는 함수
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 1;
    }
}
