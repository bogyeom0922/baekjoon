import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s_arr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		double[] score_arr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		
 		double cSum = 0;
		double sSum = 0;
		for(int i=0; i<20; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			String sub = st.nextToken();
			double c = Double.parseDouble(st.nextToken());
			String s = st.nextToken();
			
			if(s!="P") {
				for(int j=0; j<9; j++) {
					if(s.equals(s_arr[j])) {
						sSum += c * score_arr[j];
						cSum += c;
					}
				}
			}	
 		}
		
		double average = sSum / cSum;
		
		System.out.printf("%.6f\n", average);
		
		br.close();
		
	}

}
