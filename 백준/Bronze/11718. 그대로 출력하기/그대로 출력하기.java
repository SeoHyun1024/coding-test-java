import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    
	    while((str = br.readLine()) != null && !str.isEmpty()){
	        System.out.println(str);
	    }
	}
}