import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = A*B*C;
		
		for(int i=0; i<10; i++) {
			int count=0;
			int x = D;
			while(x>10) {
				if((x%10)==i) {
					count++;
				}
				x /= 10;
			}
			if((x%10)==i) {
				count++;
			}
			System.out.println(count);
		}
		
		scan.close();
		
	}

}
