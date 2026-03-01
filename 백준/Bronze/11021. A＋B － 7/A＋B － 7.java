import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    for(int i = 0; i < N; i++){
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       System.out.println("Case #" + (i+1) + ": " + (a+b));    
	    }
	}
}