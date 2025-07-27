class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        for (int i = 1; i <= citations.length; i++) {
            int count = i;
            for (int j : citations) {
                if (j >= i) count--;
            }
            if (count <= 0) answer = i;
        }

        return answer;
    }
}