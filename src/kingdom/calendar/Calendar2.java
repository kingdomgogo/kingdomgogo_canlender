package kingdom.calendar;

import java.util.Scanner;

public class Calendar2 extends Calendar1 {

	public void Prompt() {
		String prom = "> ";
		Scanner scn2 = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		
		Calendar2 cal = new Calendar2();
		
		int year = 1;
		int month = 1;
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(prom);
			year = scn2.nextInt();
			System.out.println("월을입력하세요.");
			System.out.print(prom);
			month = scn.nextInt();
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			cal.calendarChart(year, month);
			System.out.println();
			System.out.println();
		}

		System.out.println("\"Bye\"");
		scn2.close();
		scn.close();
	}
	
	
	public static void main(String[] args) {
		Calendar2 p = new Calendar2(); 
		p.Prompt();
	}
}
