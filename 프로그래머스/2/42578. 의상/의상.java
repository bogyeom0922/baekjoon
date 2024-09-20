import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] c: clothes) {
            String category = c[1];
            map.put(category, map.getOrDefault(category, 0)+1);
        }
        
        for(int i: map.values()) {
            answer *= (i+1);
        }
        
        return answer-1;
    }
}