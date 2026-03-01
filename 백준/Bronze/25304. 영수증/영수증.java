import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int N = in.nextInt();
		
		int sum = 0;
		for(int i = 0; i < N; i++){
		    int price = in.nextInt();
		    int n = in.nextInt();
		    
		    sum += price * n;
		}
	    
	    if (sum == total) System.out.println("Yes");
	    else System.out.println("No");
	}
}