package kingdom.calendar;

import java.util.Scanner;

public class Calendar1 {

	private static final int months [] = {31,28,31,30,31,30,31,30,31,30,31,30};
	public int getMonth(int month) {
		return months[month-1];
	}
			
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		Calendar1 cal = new Calendar1();
		System.out.println("반복횟수를 입력하세요.");
		int re = scn.nextInt();
		for(int i=0; i<re; i++) {
	
		System.out.println("원하는 달을 입력하세요.");
	    int month = scn.nextInt(); 
	    System.out.printf("%d월은 %d까지 입니다.\n", month,cal.getMonth(month));
		}
	    scn.close();
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
