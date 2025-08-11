import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] arr;
    public static String result;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    arr = new int[8];
	    result = "";
	    
	    for (int i = 0; i < arr.length; i++){
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    for (int i = 0; i < arr.length; i++){
	        if (result !="mixed" && result != "descending" && arr[i] == i + 1) result = "ascending";
	        else if (result !="mixed" && result != "ascending" && arr[i] == 8 - i) result = "descending";
	        else result = "mixed";
	    }
	    System.out.println(result);
	    
	}
}