import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int thaiYear = sc.nextInt();
        int koreaYear = thaiYear-543;

        System.out.println(koreaYear);
    }
}

