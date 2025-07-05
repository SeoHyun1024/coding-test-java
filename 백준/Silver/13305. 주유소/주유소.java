import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int n = sc.nextInt();   // 도시 갯수
        Long[] distances = new Long[n - 1]; // 도시 간 거리
        Long[] prices = new Long[n]; // 리터 당 가격

        for (int i = 0; i < n - 1; i++) {
            distances[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
        }

        long min_price = prices[0];  // 최솟값 초기화
        long total_price = 0;    // 총 가격

        // 가격 최솟값 계산
        for (int i = 0; i < n - 1; i++) {
            if (min_price > prices[i]) {
                min_price = prices[i];
            }
            total_price += min_price * distances[i];
        }
        System.out.println(total_price);
    }
}
