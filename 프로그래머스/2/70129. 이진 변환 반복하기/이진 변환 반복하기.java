class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(!s.equals("1")){
            s = convert(s, answer);
            answer[0]++;
        }
        
        return answer;
    }
    
    public String convert(String s, int[] answer){
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == '1') sb.append(c);
            else answer[1]++;
        }
        s = Integer.toBinaryString(sb.length());
        return s;
    }
}