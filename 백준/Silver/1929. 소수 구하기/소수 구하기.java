import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j <= N; j = j+i) {
                arr[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
        
        scan.close();
    }

}