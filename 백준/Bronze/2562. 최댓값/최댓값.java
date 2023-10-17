import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt();
		int count=1;
		int maxcount = count;
		
		for(int i=0; i<8; i++) {
			int newnum = scan.nextInt();
			count++;
			if(newnum > max) {
				max=newnum; 
				maxcount=count;
			}
		}
		System.out.println(max);
		System.out.print(maxcount);
		
		scan.close();

	}

}
