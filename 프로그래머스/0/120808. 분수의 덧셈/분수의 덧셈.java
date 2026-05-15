class Solution {
    public static int a, b;
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        a = (numer1 * denom2) + (numer2 * denom1);
        b = denom1 * denom2;
        
        for(int i = 999 * 999; i > 0; i--){
            if (a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                break;
            }            
        }
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}