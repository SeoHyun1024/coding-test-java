import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int solution(int[] people, int limit) {
       Arrays.sort(people);    // 오름차순 정렬

        int count = 0;
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (i != j && people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}