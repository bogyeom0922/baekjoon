import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int kg5 = 0;
		int kg3 = 0;
		while (N>=3) {
			if(N%5 == 0) {
				N -= 5;
				kg5 += 1;
			} else if(N%3 ==0) {
				N -= 3;
				kg3 += 1;
			} else if(N > 5) {
				N -= 5;
				kg5 += 1;
			} else if(N >= 3) {
				N -= 3;
				kg3 += 1;
			}
		}
		if (N==0) {
			System.out.print(kg5+kg3);
		} else {
			System.out.print(-1);
		}
		
		scan.close();
	}

}
