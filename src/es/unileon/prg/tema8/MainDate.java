package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		try {
			today = new Date(21,9,2020);
			System.out.println(today);
			System.out.println(today.isSameYear(2020));
			System.out.println(today.isSameMonth(11));
			System.out.println(today.isSameDay(11));
			System.out.println(today.isSame("11/11/2021"));
			System.out.println(today.nameMonth());
			System.out.println(today.isDayRight());
			System.out.println(today.getEstacion());
			System.out.println("quedan "+today.monthsLeft()+" meses hasta que acabe el año");
			System.out.println("las fechas que quedan hasta que acabe el mes son:"+today.daysLeft());
			System.out.println(today.sameNumberOfDays());
			System.out.println(today.daysPassed());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}