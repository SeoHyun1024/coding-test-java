import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // 구슬 갯수 입력
      int n = sc.nextInt();
      Integer[] arr = new Integer[n];

      // 팔찌 구슬 번호 입력
      for(int i =0 ; i < n; i++){
          arr[i] = sc.nextInt();
      }

      // 오름 차순 정렬
      Arrays.sort(arr);

      Integer[] num = new Integer[n];
      
      // 팔찌 길이 계산
      for(int i = 0; i < n ; i++){
          num[i] = Math.abs(arr[(i+1) % n] - arr[i % n]);
      }

      int sum = 0;
        
      // 팔찌 길이 합
      for(int i: num){
          sum += i;
      }
      System.out.println(sum);
    }
}
