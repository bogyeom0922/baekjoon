import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String input = br.readLine();
			
			if(input.equals(".")) break;
			System.out.println(solve(input));
			
		}
		
		br.close();
		
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if( c == '(' || c == '[' ) {
				stack.push(c);
			}
			
			if( stack.isEmpty() ) {
				if( c == ')' || c == ']' ) {
					return "no";
				}
			} 
			
			if ( !stack.isEmpty() && c==')' ) {
				if( stack.peek() == '(' ) {
					stack.pop();
				} else {
					return "no";
				}
			}
			
			if ( !stack.isEmpty() && c==']' ) {
				if( stack.peek() == '[' ) {
					stack.pop();
				} else {
					return "no";
				}
			}
			
		}
		
		if( !stack.isEmpty() ) {
			return "no";
		} return "yes";
		
	}

	
}