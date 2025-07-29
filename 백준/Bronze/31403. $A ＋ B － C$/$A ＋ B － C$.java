import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static String A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = br.readLine();
        B = br.readLine();
        C = br.readLine();


        String s = A + B;
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        // 정수로 생각했을 때
        int result1 = a + b - c;
        // 문자열로 생각했을 때
        int result2 = Integer.parseInt(s) - c;

        System.out.println(result1);
        System.out.println(result2);
    }
}