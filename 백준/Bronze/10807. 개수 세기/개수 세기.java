import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		int N = scan.nextInt();
		for(int i=1; i<=N; i++) {
			num.add(scan.nextInt());
		}
		
		int v = scan.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if (num.get(i) == v) {
				count++;
			}
		}
		System.out.print(count);
	}

}
