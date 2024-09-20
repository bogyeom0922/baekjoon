import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i : arr) {
            if (!stack.isEmpty() && stack.peek() == i) {
                continue;
            } else {
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}