import java.util.*;
import java.lang.*;
import java.io.*;

// 학생들은 초기에 북쪽을 바라보고 있으며, 종서는 다음과 같은 형태의 지시를 총 열 번 내린다:
// 1. 우향우: 각 학생은 현재 상태에서 오른쪽으로 90도 돈다.
// 2. 뒤로 돌아: 각 학생은 현재 상태에서 오른쪽으로 180도 돈다.
// 3. 좌향좌: 각 학생은 현재 상태에서 왼쪽으로 90도 돈다.

class Main {
    public static Map<Integer, Integer> map;
    public static char[] direction;

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new HashMap<>(3);
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, -1);

        direction = new char[] {'N', 'E', 'S', 'W'};

        int n = 10, sum =0;
        while(n-- > 0){
            int command = Integer.parseInt(br.readLine());
            sum += map.get(command);
        }

        char answer = direction[Math.abs(sum % 4)];
        System.out.println(answer);

    }
}