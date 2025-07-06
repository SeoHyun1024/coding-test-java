import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
         int answer = 0;
        int[] uniforms = new int[n];
        Arrays.fill(uniforms, 1);

        // 도난 & 여벌 처리
        for (int i : lost) uniforms[i - 1]--;
        for (int i : reserve) uniforms[i - 1]++;

        for (int i = 0; i < n; i++) {
            if (uniforms[i] == 0) {
                // 왼쪽 친구 확인
                if (i > 0 && uniforms[i - 1] == 2) {
                    uniforms[i]++;
                    uniforms[i - 1]--;
                }
                // 오른쪽 친구 확인
                else if (i < n - 1 && uniforms[i + 1] == 2) {
                    uniforms[i]++;
                    uniforms[i + 1]--;
                }
            }
        }

        for (int u : uniforms) {
            if (u >= 1) answer++;
        }

        return answer;
    }
}