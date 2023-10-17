import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] balls = new int[N];
		
		int M = scan.nextInt();
		for(int c=0; c<M; c++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			for(int n=i; n<=j; n++) {
				balls[n-1] = k;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(balls[i] + " ");
		}
		
		scan.close();
		
	}

}


