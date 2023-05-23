import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count=0;
		
		for(int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) count++;
		}
		if(count==0) System.out.print(1);
		else System.out.print(0);

		scan.close();
	}

}
