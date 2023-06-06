import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		word = word.toUpperCase();
		int[] array = new int[26];
		
		for(int i=0; i<word.length(); i++) {
			if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				array[word.charAt(i)-'A']++; //인덱스값 +1
			}
		}
		
		int max = -1;
		char output = '?';
		
		for(int i=0; i<26; i++) {
			if(array[i] > max) {
				max = array[i];
				output = (char)(i+65);
			} else if (max == array[i]) output = '?';
		}
		
		System.out.print(output);
		
		scan.close();
	}

}