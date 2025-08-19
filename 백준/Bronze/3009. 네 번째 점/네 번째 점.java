import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static int[] x;
    public static int[] y;

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = new int[3];
        y = new int[3];
        for (int i = 0;i  < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        int X = findCoordinates(x);
        int Y = findCoordinates(y);
        
        System.out.println(X + " " + Y);
    }
    
    public static int findCoordinates(int[] arr){
        int answer = 0;
        if (arr[0] == arr[1]) {
            answer = arr[2];
        }else if (arr[0] == arr[2]){
            answer = arr[1];
        }else if (arr[1] == arr[2]){
            answer = arr[0];
        }
        
        return answer;
    }
}