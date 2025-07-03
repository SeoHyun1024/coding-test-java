import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       int[] result = computeMultiply(a, b);
       int sum = 0;

       for(int i = 0; i < result.length; i++) {
           System.out.println(result[i]);
           sum += (int) (result[i]*(Math.pow(10, i)));
       }
       System.out.println(sum);;
    }

    static int[] computeMultiply(int a, int b) {

        return new int[] {
                a*(b%10),
                a*((b/10)%10),
                a*(b/100)
        };
    }
}