import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int n = sc.nextInt(), m = sc.nextInt();

        int count = 0;

        // 못 움직임.
        if (n == 1) {
            count = 1;
        }

        // 무조건 우측으로 2칸, 최대 이동 수 계산
        if (n == 2) {
            count = Math.min(4, (m+1)/2);
        }
        
        
        if (n >= 3) {
            if (m >= 7) {
                count = m - 2;
            } else {
                count = Math.min(m, 4);
            }
        }

        System.out.println(count);
    }
}
