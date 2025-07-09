import java.io.*;
import java.util.*;

public class Main {
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정수값 입력
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 입력
        st = new StringTokenizer(br.readLine());
        int[] operators = new int[4];
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }


        calculate(A, 1, A[0], operators);

        System.out.println(max);
        System.out.println(min);


    }

    public static void calculate(int[] A, int idx, int result, int[] operators) {
        if (idx == A.length) {
            min = Math.min(min, result);
            max = Math.max(max, result);
            return;
        }

        for (int i = 0; i < operators.length; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                int newResult = result;
                if (i == 0) newResult = result + A[idx];
                else if (i == 1) newResult = result - A[idx];
                else if (i == 2) newResult = result * A[idx];
                else if (i == 3) {
                    if (result >= 0) newResult = result /= A[idx];
                    else newResult = -((-result) / A[idx]);
                }
                calculate(A, idx + 1, newResult, operators);
                operators[i]++;
            }
        }
    }


}
