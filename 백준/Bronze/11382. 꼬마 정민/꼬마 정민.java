import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] line = br.readLine().split(" ");
       long a = Long.parseLong(line[0]);
       long b = Long.parseLong(line[1]);
       long c = Long.parseLong(line[2]);

      long sum = a + b + c;
       System.out.println(sum);;
    }
}

