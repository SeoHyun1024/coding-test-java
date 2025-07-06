class Solution {
     public static String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (char c : number.toCharArray()){
            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length() -1) < c){
                sb.deleteCharAt(sb.length() -1);
                k--;
            }
            sb.append(c);
        }

        if(k > 0){
            sb.delete(sb.length() - k, sb.length());
        }

        answer = sb.toString();

        return answer;
    }
}