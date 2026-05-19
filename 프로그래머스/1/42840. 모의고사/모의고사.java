import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[][] students = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int max = 0;
        for(int i = 0; i < 3; i++){
            int cnt =  marking(answers, students[i]);
            if (cnt > max){
                max = cnt;
                answer = new ArrayList<>();
                answer.add(i + 1);                
            }
            else if(cnt == max){
                answer.add(i + 1);
            }
        }
        Collections.sort(answer);
                
        
        return answer;
    }
    
    public int marking(int[] answers, int[]students){
        int count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == students[i % students.length]) count++;
        }
        
        return count;
    }
}