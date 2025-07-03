import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int peopleNum = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();

        Integer[] times = new Integer[peopleNum];

        for (int i = 0; i < peopleNum; i++) {
            times[i] =Integer.parseInt(line.split(" ")[i]);
        }
        Arrays.sort(times, Comparator.naturalOrder());


        int totalSum = 0;
        int individualSum = 0;
        for (int i : times){
            individualSum += i;
            totalSum += individualSum;
        }
        System.out.println(totalSum);
    }
}