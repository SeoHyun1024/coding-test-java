import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    // 0으로 초기화
	    int[] arr = new int[N];
	    
	    for(int i = 0; i < M; i++){
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       int z = sc.nextInt();
	       
	       for(int j = x-1; j < y; j++){
	           arr[j] = z;
	       }
	    }
	    
	    for(int i : arr){
	        System.out.print(i +" ");
	    }
	}
}