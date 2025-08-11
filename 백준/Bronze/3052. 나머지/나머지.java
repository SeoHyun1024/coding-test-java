import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static Set<Integer> set;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    set = new HashSet<>();
	    
	    for (int i = 0; i < 10; i++){
	        set.add(Integer.parseInt(br.readLine()) % 42);
	    }

	    System.out.print(set.size());
	}
}