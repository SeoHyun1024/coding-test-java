import java.io.*;
import java.util.*;

    class Info {
        int failures;
        int challengers;
        double percentage;

        Info() {
            failures = 0;
            challengers = 0;
            percentage = 0.0;
        }
    }

    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Map<Integer, Info> map = new HashMap<>();

            // 스테이지 초기화
            for (int i = 0; i < N; i++) {
                map.put(i + 1, new Info());
            }

            // 실패자 수 저장
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] == N + 1) continue;
                map.get(stages[i]).failures++;
            }

            // 스테이지 별 도달 유저 수 저장
            for (int i = 0; i < stages.length; i++) {
                for (int j = 0; j < stages[i]; j++) {
                    if (j == N) continue;
                    map.get(j+1).challengers++;
                }
            }

            // 실패율 계산
            for (int i = 0; i < N; i++) {
                int failures = map.get(i + 1).failures;
                double challengers = map.get(i + 1).challengers;
                if (challengers == 0) continue;
                map.get(i+1).percentage = failures/challengers;
            }

            List<Map.Entry<Integer, Info>> list = new ArrayList<>(map.entrySet());
            list.sort((e1, e2) -> Double.compare(e2.getValue().percentage, e1.getValue().percentage));  // 실패율 기준으로 내림차순으로 리스트 정렬

            // answer 리스트에 저장
            for (int i = 0; i < N; i++) {
                answer[i] = list.get(i).getKey();
            }

            return answer;
        }
    }