package kingdom.calendar;

public class Calendar1 {

	private static final int months[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private static final int leapMonths[] = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public boolean leapYear(int year) {
		if(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0 ))
			return true; 
		else 
			return false; 
	}
	public int getMonth(int year, int month) {
		if(leapYear(year)) {
		return leapMonths[month - 1];
		}
		else {
		return months[month - 1];
		}
	}
	
	public void calendarChart(int year, int month) {
		
		System.out.printf("   <<%4d년,%3d월>>\n", year, month);
		System.out.println("   일  월  화  수  목  금  토 ");
		System.out.println("----------------------");
		int maxdayofmonth = getMonth(year, month);

		for (int i = 1; i <= maxdayofmonth; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}

}
