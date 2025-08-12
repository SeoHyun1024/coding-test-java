import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;
    public static double[] arr;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());    // 과목 수
	    
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    double sum = 0.0;
        arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        double max = (double) arr[N - 1];
        
        double avg = (double) sum / max * 100 / N;
	    
	    System.out.println(avg);
	    
	}
}