import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
		for ( int i=0; i<K; i++ ) {
			int element = Integer.parseInt(br.readLine());
			if ( element == 0 ) {
				stack.pop();
				
			}
			else {
				stack.push(element);
			}	
		}
		
		int sum = 0;
		for( int i=0; i<stack.size(); i++ ) {
			sum += stack.elementAt(i);
		}
		System.out.println(sum);
		
		br.close();
		
	}

}
