import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		for(int i=0; i<26; i++) {
			int n = -1;
			for(int j=0; j<S.length(); j++) {
				if( S.charAt(j) == (char)('a'+i) ) {
					n = j;
					break;
				}
			}
			System.out.print(n +" ");
		}
		
		scan.close();

	}

}
