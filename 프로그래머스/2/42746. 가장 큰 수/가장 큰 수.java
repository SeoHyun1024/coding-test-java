import java.io.*;
import java.util.Arrays;

class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] numbersStr = new String[numbers.length];   // 문자열 배열로 변환

            for (int i = 0; i < numbers.length; i++) {
                numbersStr[i] = String.valueOf(numbers[i]);
            }

            // 문자열로 이어붙였을 때 더 큰 문자열 선택
            Arrays.sort(numbersStr, (a, b) -> (b + a).compareTo(a + b));
    
            // 모든 입력이 0일 때
            if (numbersStr[0].equals("0")) {
                return "0";
            }

            for (int i = 0; i < numbers.length; i++) {
                answer = answer.concat(numbersStr[i]);
            }
            return answer;
        }
    }