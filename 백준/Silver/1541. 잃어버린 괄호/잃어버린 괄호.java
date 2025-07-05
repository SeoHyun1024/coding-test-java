import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        char[] chars = sc.nextLine().toCharArray();
        int j = 0;
        int positiveSum = 0;    // + 정수
        int negativeSum = 0;    // - 정수
        int flag = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+' || chars[i] == '-' || i == chars.length - 1) {
                int isLastValue = i == chars.length - 1 ? 1 : 0;

                if (flag == 0) {
                    positiveSum += charToInt(chars, j, i + isLastValue);
                    j = i + 1;
                    if (chars[i] == '-') {
                        flag = 1;
                    }
                } else {
                    negativeSum += charToInt(chars, j, i + isLastValue);
                    j = i + 1;

                }

            }
        }

        System.out.println(positiveSum - negativeSum);

    }

    /// 특정 인덱스 정수형 변환
    static int charToInt(char[] chars, int i, int j) {
        char[] a = Arrays.copyOfRange(chars, i, j);

        return Integer.parseInt(String.valueOf(a));
    }
}
