import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int min = scan.nextInt();
		int max = min;
		for(int i=0; i<count-1; i++){
			int num = scan.nextInt();
			if(num<min) min = num;
			if(num>max) max = num;
		}
		
		System.out.print(min+" "+max);
		
		scan.close();
		
	}

}
