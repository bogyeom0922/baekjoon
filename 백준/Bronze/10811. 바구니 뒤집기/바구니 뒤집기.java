import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] basket = new int[N];
		
		for (int i=0; i<N; i++) {
			basket[i] = i+1;
		}
		
		for (int k=0; k<M; k++) {
			int i = scan.nextInt()-1;
			int j = scan.nextInt()-1;
			for(int l=0; l<=(j-i)/2; l++) {
				int index = basket[i+l];
				basket[i+l] = basket[j-l];
				basket[j-l] = index;
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(basket[i]);
			System.out.print(' ');
		}
		
		scan.close();
		
	}

}
