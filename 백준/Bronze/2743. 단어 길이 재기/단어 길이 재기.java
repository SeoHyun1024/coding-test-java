import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static String str;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    str = br.readLine();    // 단어 입력    

	    System.out.println(str.length());
	}
}