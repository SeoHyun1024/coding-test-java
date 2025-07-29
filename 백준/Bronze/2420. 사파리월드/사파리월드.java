import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static long N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        N = Long.parseLong(s.split(" ")[0]);
        M = Long.parseLong(s.split(" ")[1]);

        System.out.println(Math.abs(N - M));
    }
}