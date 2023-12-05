import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int word=0;
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			String x = scan.next();
			boolean[] alp = new boolean[26];
			boolean r = true;
			for(int j=0; j<x.length(); j++) {
				if(j==0) {
					alp[x.charAt(j)-97] = true;
				} else {
					if(alp[x.charAt(j)-97]) {
						if(x.charAt(j)!=x.charAt(j-1)) {
							r = false;
							break;
						}
					} else {
						alp[x.charAt(j)-97] = true;
					}
				}
			}
			if(r) {
				word++;
			}
		}
		
		
		System.out.print(word);
		
		scan.close();

	}

}
