package kingdom.calendar;

import java.util.Scanner;

public class Calendar2 extends Calendar1 {

	public void Prompt() {
		String prom = "> ";
		Scanner scn = new Scanner(System.in);
		Calendar2 cal = new Calendar2();
		
		int month = 1;
		while (true) {
			System.out.println("월을입력하세요.");
			System.out.print(prom);
			month = scn.nextInt();
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			cal.calendarChart(2018, month);
			System.out.println();
			System.out.println();
		}

		System.out.println("\"Bye\"");
		scn.close();
	}
	
	
	public static void main(String[] args) {
		Calendar2 p = new Calendar2(); 
		p.Prompt();
	}
}
