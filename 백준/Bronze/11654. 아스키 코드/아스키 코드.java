import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int c;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        c = br.readLine().charAt(0);
        System.out.println(c);
    }
}