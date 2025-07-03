import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nickName = sc.nextLine();
        String result = nickName.concat("??!");
        System.out.println(result);
    }
}

