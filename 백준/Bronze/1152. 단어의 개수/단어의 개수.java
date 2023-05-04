import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		int count=0;
		
		if (a.charAt(0) != ' ') {count++;}
		
		for(int i=0; i<a.length()-1; i++) {
			if (a.charAt(i) == ' ' && a.charAt(i+1) != ' ') count++;
		}
		
		System.out.println(count);
		
		scan.close();
		
	}

}
