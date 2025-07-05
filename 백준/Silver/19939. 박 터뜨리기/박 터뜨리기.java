import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = calculate(n, m);
        System.out.println(result);
    }

    /// 공 갯수 차이 최솟값 계산 함수
    static int calculate(int n, int m){
        // 모든 공의 갯수가 다르게 하기 위해 한개씩 차이를 둠
        int distributionSum = m * (m + 1) / 2;

        if (n > m && (n - distributionSum) >= 0) {
            int distributionQ = (n - distributionSum) / m;
            int distributionR = (n - distributionSum) % m;

            Integer[] carriages = new Integer[m];

            for(int i = 0; i < m; i++){
                carriages[i] = distributionQ + (i+1);   // 몫 + 인덱스 번호 만큼 공을 분배

                if (distributionR <= i) {   // 나머지 만큼 공을 1개씩 추기
                    carriages[i] ++;
                }
            }
            return carriages[m-1] - carriages[0];
        }
        return -1;
    }
}
