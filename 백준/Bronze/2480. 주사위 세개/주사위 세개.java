import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1= scan.nextInt();
		int n2= scan.nextInt();
		int n3= scan.nextInt();
		int money;
		
		if (n1==n2 && n2==n3) {
			money = 10000 + (n1 * 1000);
		} else if (n1==n2 && n2!=n3) {
			money = 1000 + (n1 * 100);
		} else if (n1==n3 && n2!=n3) {
			money = 1000 + (n1 * 100);
		} else if (n2==n3 && n1!=n2) {
			money = 1000 + (n2 * 100);
		} else {
			int max = n1;
			if (n2>max) {
				max = n2;
			}
			if (n3>max) {
				max = n3;
			}
			money = max*100;
		}
		System.out.print(money);
	}

}
