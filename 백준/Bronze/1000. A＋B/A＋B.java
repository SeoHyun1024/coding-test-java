import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int result = add(a, b);

        System.out.println(result);
    }

    static int add(int a , int b){
        return a + b;
    }
}