import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
	    int c = in.nextInt();
	    
	    int time = a*60 + b;
	    time += c;
	    
	    int h = (time % (24*60)) / 60;
	    int m = (time % (24*60)) % 60;
	    
	    System.out.println(h + " " + m);
	}
}