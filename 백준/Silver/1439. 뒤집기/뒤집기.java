import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 후 문자 배열로 전환
        String input = sc.nextLine();
        char[] ch = input.toCharArray();

        int cnt1 = 0;   // 0 으로 이루어진 문자열 덩어리 갯수
        int cnt2 = 0;   // 1 으로 이루어진 문자열 덩어리 갯수

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                if (ch[i + 1] == '0') {
                    cnt1++;
                } else cnt2++;
            }
        }
        
        // 맨 앞 문자열 덩어리 카운트
        if (ch[0] == '0') {
            cnt1++;
        } else if (ch[0] == '1') {
            cnt2++;
        }

        int min = Math.min(cnt1, cnt2); // 최솟값 계산
        System.out.println(min);
    }
}
