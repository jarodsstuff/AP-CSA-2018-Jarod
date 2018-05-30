
public class MinutesYear {
	public static void main(String[] args) {
		final int MIN_IN_HOUR = 60;
		final int HOUR_IN_DAY = 24;
		final int DAYS_IN_YEAR = 365;
		int minutesPerYear = MIN_IN_HOUR * HOUR_IN_DAY * DAYS_IN_YEAR;
		System.out.println("The Number of minutes in a year is: " + minutesPerYear);
	}

}
