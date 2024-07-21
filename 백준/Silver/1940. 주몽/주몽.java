import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n+1];

        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int count=0;
        int s=1, e=n;
        while (s!=e) {
            if(arr[s]+arr[e]==k){
                count++;
                s++;
            } else if(arr[s]+arr[e]<k){
                s++;
            } else if(arr[s]+arr[e]>k){
                e--;
            }
        }

        System.out.println(count);
    }
}