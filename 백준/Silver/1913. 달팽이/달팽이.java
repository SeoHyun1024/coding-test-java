import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] snail = new int[N][N];  // 저장할 달팽이 배열 선언
        int value = 1;  // 배열에 저장할 값    
        int cols = N / 2;   // 시작 열 번호
        int rows = N / 2;   // 시작 행 번호

        snail[N / 2][N / 2] = 1;    // 첫 번째 값 초기화
        
        // 달팽이 배열 값 저장
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                snail[cols][rows] = value;  // 값 저장
                value++;
                cols += (int) Math.pow(-1, i);  // 열 이동
            }
            for (int j = 1; j <= i && cols >= 0; j++) {
                snail[cols][rows] = value;  // 값 저장
                value++;
                rows += (int) Math.pow(-1, i - 1);  // 행 이동
            }
        }
        
        // 달팽이 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(snail[i][j] + " ");
            }
            System.out.println();
        }
        
        // 달팽이 배열 탐색하면서 해당값(M) 좌표 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (snail[i][j] == M) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }

}
