import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());   // 정수값 입력

        sum = 0;
        String line = br.readLine();
        for (char c : line.toCharArray()) {
            int x = c - '0';
            sum += x;
        }
        System.out.println(sum);
    }
}