import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();


       int[] result = computeMod(a, b, c);

       for(int i : result) {
           System.out.println(i);
       }
    }

    static int[] computeMod(int a, int b, int c) {
        int aMod = a % c;
        int bMod = b % c;

        return new int[] {
                (a+b) % c,
                (aMod + bMod) % c,
                (a*b) % c,
                (aMod * bMod) % c
        };
    }
}