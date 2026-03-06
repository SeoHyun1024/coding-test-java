class Solution {
    public String solution(String s) {
        String answer = "";
        int half_length = s.length() / 2;        
        
        if(s.length() % 2 == 0){
            answer = s.substring(half_length - 1, half_length + 1);
        } else{
            answer = s.substring(half_length, half_length + 1);
        }
        
        return answer;
    }
}