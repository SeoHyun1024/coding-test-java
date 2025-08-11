import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int P, C, F;

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    P = Integer.parseInt(br.readLine());    // 배달 성공 횟수
	    C = Integer.parseInt(br.readLine());    // 충돌 횟수
	    
	    int bonus = (P > C) ? 1 : 0;
	    
	    F += P*50 - C*10 + bonus*500;
	    
	    System.out.print(F);
	}
}

// 배달 성공하면 + 50점
// 충돌하면 - 10점
// 배달 횟수가 충돌 횟수보다 크면 보너스 + 500점
// ***** 입력 *****
// 입력 첫번째줄 : 양수 P (배달 성공 횟수)
// 입력 두번째줄 : 양수 C (충돌 횟수)
// ***** 출력 *****
// 정수 F : 최종 점수