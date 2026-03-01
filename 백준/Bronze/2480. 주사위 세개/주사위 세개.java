import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
	    int c = in.nextInt();
	    
	    int prize = 0;
	    
	    if(a == b && b == c){
	     prize = 10000 + a * 1000;   
	    }else if (a == b){
	        prize = 1000 + a * 100;
	    }else if (b == c){
	        prize = 1000 +  b * 100;
	    }else if (a == c){
	        prize = 1000 + a * 100;
	    }else{
	        prize = Math.max(Math.max(a, b), c) * 100;
	    }
	    
	    System.out.println(prize);
	}
}