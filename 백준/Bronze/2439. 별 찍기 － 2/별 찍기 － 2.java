import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());   // 정수값 입력

        for (int i = 1; i <= N; i++){
            String s = "*".repeat(i);
            System.out.printf("%" + N + "s\n", s);

        }
    }
}