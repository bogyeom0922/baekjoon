import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.next().split("");
        int len = N.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(N[i]);
        }


        for (int i = 0; i < len - 1; i++) {
            int max = arr[i];
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
