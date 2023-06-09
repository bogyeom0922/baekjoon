import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		
		try {
		
			BufferedReader bin = new BufferedReader( new InputStreamReader(System.in));
	 			
				Stack<Integer> stack = new Stack<>();
				int N = Integer.parseInt(bin.readLine());
				
				for(int i=0; i<N; i++) {
					String s = bin.readLine();
					String[] list = s.split(" ");
					
					switch(list[0]) {
					case "push":
						stack.push(Integer.parseInt(list[1]));
						break;
					case "pop":
						if(!stack.empty()) System.out.println(stack.pop());
						else System.out.println(-1);
						break;
					case "size":
						System.out.println(stack.size());
						break;
					case "empty":
						if (stack.empty()) System.out.println(1);
						else System.out.println(0);
						break;
					case "top":
						if(!stack.empty()) { System.out.println(stack.peek()); }
						else System.out.println(-1);
						break;
					default:
						break;
					}
				}
				
				bin.close();
				
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
	}

}
