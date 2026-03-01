import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    // 두 수 는 같지 않은 세 자리 정수   
	    char[] N = Integer.toString(sc.nextInt()).toCharArray();
	    char[] M = Integer.toString(sc.nextInt()).toCharArray();
	    
	    N = swap(N);
	    M = swap(M);
	    
	    int n = Integer.parseInt(String.valueOf(N));
	    int m = Integer.parseInt(String.valueOf(M));
	    
	    System.out.println(Math.max(n, m));
	    
	}
	
	public static char[] swap(char[] num){
	    char temp = num[0];
	    num[0] = num[2];
	    num[2] = temp;
	    
	    return num;
	}
}