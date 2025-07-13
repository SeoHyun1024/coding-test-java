class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int totalSize = brown + yellow;
        int x = totalSize - 1, y = 1;
        
        
        
       for (; x > 0; x--) {
            if (totalSize % x == 0) {
                y = totalSize / x;
                if (x < y) break;
                if ((x + y) * 2 - 4 == brown) {
                    answer = new int[]{x, y};
                }
            }
        }
        
        
        return answer;
    }
}