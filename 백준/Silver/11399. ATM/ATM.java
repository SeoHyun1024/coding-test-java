import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사람 수 입력
        int peopleNum = sc.nextInt();
        Integer[] times = new Integer[peopleNum];

        // 입력: 한 사람씩 바로 받기
        for (int i = 0; i < peopleNum; i++) {
            times[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(times);

        int totalSum = 0;   // 필요한 시간의 최솟값
        int accumulatedSum = 0; // 누적합

        for (int time : times) {
            accumulatedSum += time;
            totalSum += accumulatedSum;
        }

        System.out.println(totalSum);
    }
}
