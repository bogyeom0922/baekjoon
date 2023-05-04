import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] ball = new int[N];
		
		for (int i=0; i<N; i++) {
			ball[i] = i+1;
		}
		
		for (int i=0; i<M; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			
			int index = ball[p-1];
			ball[p-1] = ball[q-1];
			ball[q-1] = index;
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(ball[i]);
			System.out.print(' ');
		}

		scan.close();
	}

}
