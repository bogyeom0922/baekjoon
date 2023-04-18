import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a=1, b=1;
		int k=1;
		
		for(int i=1; i<n; i++) {
			if (b > 1) {
				b--;
				a++;
			}
			else {
				b += a;
				a = 1;
				k=b;
			}
		}
		
		if(k%2==0) {
			System.out.println(a+"/"+b);
		} else {
			System.out.println(b+"/"+a);
		}
		
		
		scan.close();
	}

}
