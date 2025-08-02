import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int X, Y;

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        int left = 0, right = 1_000_000_000;
        int answer = -1;
        int Z = calculateWinningRate(X, Y, 0);

        if (Z < 99) {
            while (left <= right) {
                int mid = (left + right) / 2;
                int winningRate = calculateWinningRate(X, Y, mid);
                if (winningRate > Z) {
                    answer = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        System.out.println(answer);
    }

    public static int calculateWinningRate(int x, int y, int n) {
        return (int) ((long)(y + n) * 100 / (x + n));
    }
}