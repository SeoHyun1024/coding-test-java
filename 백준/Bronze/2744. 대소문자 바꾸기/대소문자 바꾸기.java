import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static String str;
    
    public static String swapCase(String input){
        StringBuilder sb = new StringBuilder();
        
        for (char ch : input.toCharArray()){
           if (Character.isUpperCase(ch)){
               sb.append(Character.toLowerCase(ch));
           }else{
               sb.append(Character.toUpperCase(ch));
           }
        }
        return sb.toString();
    }
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    str = br.readLine();    // 단어 입력    

	    String swapStr = swapCase(str);
	    System.out.println(swapStr);
	}
}