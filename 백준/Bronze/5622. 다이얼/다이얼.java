import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    
	    Map<Integer, char[]> map = new HashMap<>();
	    map.put(2, new char[]{'A','B','C'});
	    map.put(3, new char[]{'D','E','F'});
	    map.put(4, new char[]{'G','H','I'});
	    map.put(5, new char[]{'J','K','L'});
	    map.put(6, new char[]{'M','N','O'});
	    map.put(7, new char[]{'P','Q','R','S'});
	    map.put(8, new char[]{'T','U','V'});
	    map.put(9, new char[]{'W','X','Y','Z'});
	    
	    int answer = 0;
	    for(char c : s.toCharArray()){
    	    for(Map.Entry<Integer,char[]> entry : map.entrySet()){
    	        if(new String(entry.getValue()).indexOf(c) != -1){
    	            answer += entry.getKey() +1;
    	            break;
    	        }
    	    }
	    }
	    System.out.println(answer);
	}
}