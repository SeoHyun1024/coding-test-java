import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static String str;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    str = br.readLine();    // 성적 입력    
	    
	     Map<String, Double> map = Map.ofEntries(
                Map.entry("A+", 4.3),
                Map.entry("A0", 4.0),
                Map.entry("A-", 3.7),
                Map.entry("B+", 3.3),
                Map.entry("B0", 3.0),
                Map.entry("B-", 2.7),
                Map.entry("C+", 2.3),
                Map.entry("C0", 2.0),
                Map.entry("C-", 1.7),
                Map.entry("D+", 1.3),
                Map.entry("D0", 1.0),
                Map.entry("D-", 0.7),
                Map.entry("F", 0.0)
        );
	    
	    System.out.println(map.get(str));
	}
}