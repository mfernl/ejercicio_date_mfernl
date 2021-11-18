package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		try {
			today = new Date(21,9,2020);
			System.out.println(today);
			System.out.println(today.isSameYear(2020));
			System.out.println(today.isSameMonth(9));
			System.out.println(today.isSameDay(21));
			System.out.println(today.isSame("21/9/2020"));
			System.out.println(today.nameMonth());
			System.out.println(today.isDayRight());
			System.out.println(today.getEstacion());
			System.out.println("quedan "+today.monthsLeft()+" meses hasta que acabe el año");
			System.out.println("las fechas que quedan hasta que acabe el mes son:"+today.daysLeft());
			System.out.println(today.sameNumberOfDays());
			System.out.println("Han pasado "+today.daysPassed()+" dias del año");
			System.out.println("Han hecho falta "+today.attemtsToFindDate()+" intentos para encontrar la fecha");
			System.out.println("Han hecho falta "+today.attemtsToFindDate2()+" intentos para encontrar la fecha");
			System.out.println("Hoy es "+today.diaDeLaSemana());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}