import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int n = sc.nextInt();   // 도시 갯수
        Integer[] distances = new Integer[n - 1]; // 도시 간 거리
        Integer[] prices = new Integer[n]; // 리터 당 가격

        for (int i = 0; i < n - 1; i++) {
            distances[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int min_price = prices[0];  // 최솟값 초기화
        int total_distance = 0; // 총 거리
        int distance_pasted = 0;  // 온 거리
        int total_price = 0;    // 총 가격

        // 가격 최솟값 계산
        for (int i = 0; i < n - 1; i++) {
            if (min_price > prices[i]) {
                min_price = prices[i];
            }
            total_distance += distances[i]; // 총 거리 합 계산
        }

        // 가격의 최소 합 계산
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] > min_price) {
                total_price += distances[i] * prices[i];
            } else {
                total_price += (total_distance - distance_pasted) * prices[i];
                break;
            }
            distance_pasted += distances[i];    // 지나온 거리 계산
        }

        System.out.println(total_price);
    }
}
