import java.util.*;

class Solution {
    boolean[] visited;
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        visited  = new boolean[numbers.length()];        
        
        dfs(numbers , "");
        
        for(int s : set){
            if(isPrime(s)) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(int x){
        if(x < 2) return false;
        for(int i = 2; i < x; i++){
            if(x % i == 0) return false;
        }
        return true;
    }
    
    public void dfs(String numbers, String current){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
}