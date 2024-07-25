import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        for(int i=0;i<N-1;i++){
            q.remove();
            int temp=q.remove();
            q.add(temp);
        }

        System.out.println(q.remove());

        sc.close();

    }
}