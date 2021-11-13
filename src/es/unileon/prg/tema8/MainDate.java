package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		try {
			today = new Date(21,12,2020);
			System.out.println(today);
			System.out.println(today.isSameYear(2020));
			System.out.println(today.isSameMonth(11));
			System.out.println(today.isSameDay(11));
			System.out.println(today.isSame("11/11/2021"));
			System.out.println(today.nameMonth());
			System.out.println(today.isDayRight());
			System.out.println(today.getEstacion());

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}