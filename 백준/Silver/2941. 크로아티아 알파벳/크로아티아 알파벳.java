import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (String x : word) {
			s = s.replace(x, "A");
		}
		
		System.out.print(s.length());
	}

}
