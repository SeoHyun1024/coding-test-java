import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        double result = divide(a, b);

        System.out.println(result);
    }

    static double divide(double a , double b){
        return a / b;
    }
}