import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;
    public static int max_value = 1000_000_000;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());

	   	if (N == 1 || N == 2) System.out.print(4);
	   	else if (N == max_value) {
	   	    System.out.print(max_value);
	   	}
	   	else if (N % 2 == 0){
	   	    System.out.print(N + 2);
	   	}
	   	else System.out.print(N + 1);
	}
}