import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int a; // 트리 암페어(1 ≤ a ≤ 20)
    public static int w; // 어뎁터 와트 (1 ≤ w ≤ 2000)
    public static int v; // 어뎁터 볼트 (1 ≤ v ≤ 100)
    // watt = ampere × volt → ampere = watt / volt

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    a = Integer.parseInt(br.readLine());    // 암페어 입력
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    w = Integer.parseInt(st.nextToken());   // 와트 입력
	    v = Integer.parseInt(st.nextToken());   // 볼트 입력
	    
	    if (a <= w / v) System.out.print(1);
	    else System.out.print(0);
	}
}