import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int A, B;
    public static int GCD, LCM;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    A = Integer.parseInt(st.nextToken());
	    B = Integer.parseInt(st.nextToken());
        
        if (A > B) A = A ^ B ^ (B = A);
        
        for (int i = A; i > 0; i--){
            if (A % i == 0 && B % i == 0){
                GCD = i;
                LCM = (A / i) * (B / i) * i;
                break;
            }
        }
        
        System.out.printf("%d\n%d", GCD, LCM);
	}
}