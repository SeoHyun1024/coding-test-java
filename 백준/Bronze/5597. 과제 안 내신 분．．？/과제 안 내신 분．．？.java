import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    Set<Integer> set = new HashSet<>();
	    for (int i = 1; i<= 30; i++){
	        set.add(i);
	    }
	    
	    for (int i = 0; i < 28; i++){
	        int x = Integer.parseInt(br.readLine());
	        if (set.contains(x)){
	            set.remove(x);
	        }
	    }
	    
	    for (int i : set){
	        System.out.println(i);
	    }
	}
}