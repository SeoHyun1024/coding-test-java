import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        if (a < b) System.out.println("<");
        else if (a > b) System.out.println(">");
        else System.out.println("==");
    }
}