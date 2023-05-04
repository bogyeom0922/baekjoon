import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42, scan.nextInt()%42 };
		int c=0;
		
		for (int i=0; i<10; i++) {
			int count = 0;
			for (int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count == 0) { c++; }
		}
		System.out.print(c);
		
		scan.close();

	}

}
