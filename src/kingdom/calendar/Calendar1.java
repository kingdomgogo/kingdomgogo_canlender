package kingdom.calendar;

public class Calendar1 {

	private static final int months[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getMonth(int month) {
		return months[month - 1];
	}
	
	public void calendarChart(int year, int month) {
		
		System.out.printf("   <<%4d년,%3d월>>\n", year, month);
		System.out.println("   일  월  화  수  목  금  토 ");
		System.out.println("----------------------");
		int maxdayofmonth = getMonth(month);

		for (int i = 1; i <= maxdayofmonth; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}

}
