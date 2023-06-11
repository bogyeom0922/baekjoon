import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split("");
			int count = 0;
			String o = null;
			for(int j=0; j<s.length; j++) {
				if(s[j].equals("(")) {
					count++;
				} else if(s[j].equals(")")) {
					count--;
				}
				if(count<0) { o = "NO"; }
			}
			
			if(count==0 && o!="NO") {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		br.close();
		
	}

}
