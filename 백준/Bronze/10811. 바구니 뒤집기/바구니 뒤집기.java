import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;


class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    // 초기화
	    int[] arr = IntStream.rangeClosed(1, N).toArray();
	   
	    for(int i = 0; i < M; i++){
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       
	       int temp[] = new int[N];
	       for(int j = 0; j < N; j++){
	           temp[j] = arr[j];
	       }
	      
	       for(int j = 0; j <= y - x; j++){
	           arr[y - 1 - j] = temp[x -1 + j];
	       }
	    }
	    
	    for(int i : arr){
	        System.out.print(i +" ");
	    }
	}
}