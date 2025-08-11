import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] alphabet;
    public static char[] arr;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str = br.readLine();
	    arr = str.toCharArray();
	    
	    alphabet = new int[26];
	    Arrays.fill(alphabet, -1);
	    
	    for (int i = arr.length - 1; i >= 0; i--){
	        alphabet[arr[i] - 97] = i;
	    }
	    
	    for (int i : alphabet) System.out.print(i + " ");
	}
}