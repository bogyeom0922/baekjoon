import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int time = scan.nextInt();
		
		if (minute+time >= 60) {
			if(hour == 23) {
				hour = 0;
			} else {
				hour += (minute+time)/60;
				if (hour >= 24) {
					hour -=24;
				}
			}
			minute = (minute+time)%60;
		} else {
			minute += time;
		}
		
		System.out.printf("%d %d",hour, minute);

	}

}
