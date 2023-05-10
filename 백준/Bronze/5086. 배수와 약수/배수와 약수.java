import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			if(m==0 & n==0) {
				break;
			} else if(m<n & n%m==0) {
				System.out.println("factor");
			} else if(m>n & m%n==0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		} 
		
		scan.close();

	}

}
