import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static String S;
    static int i;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        S = br.readLine();  // 문자열 입력
        i = Integer.parseInt(br.readLine());   // 정수값 입력
        
        char c = S.charAt(i - 1);
        System.out.println(c);
    }
}