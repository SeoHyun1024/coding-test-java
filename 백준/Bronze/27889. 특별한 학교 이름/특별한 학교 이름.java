import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str = br.readLine();
	    
	    Map<String, String> map = new HashMap<>() {{
	        put("NLCS" , "North London Collegiate School");
	        put("BHA" , "Branksome Hall Asia");
	        put("KIS" , "Korea International School");
	        put("SJA" , "St. Johnsbury Academy");
	    }};
	    
	    System.out.println(map.get(str));
	}
}