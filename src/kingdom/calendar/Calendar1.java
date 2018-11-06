package kingdom.calendar;

import java.util.Scanner;

public class Calendar1 {

	private static final int months[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getMonth(int month) {
		return months[month - 1];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calendar1 cal = new Calendar1();
		int month = 1;
		while (true) {

			System.out.println("원하는 달을 입력하세요.");
			month = scn.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d까지 입니다.\n", month, cal.getMonth(month));
		}

		System.out.println("Have a nice day");
		scn.close();
	}

}
