import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) {
            set.add(i);
        }
        
        answer = Math.min(set.size(), nums.length/2);
        
        return answer;
    }
}