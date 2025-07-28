import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, X;
    static ArrayList<Integer> arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st1.nextToken());
        X = Integer.parseInt(st1.nextToken());

        arr = new ArrayList<Integer>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(st2.nextToken());
            if (x < X) {
                arr.add(x);
            }
        }

        for (int x : arr)System.out.print(x + " ");
    }
}