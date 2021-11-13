package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) throws DateException {
		//this.month = month;
		this.setMonth(month);
		//this.day = day;
		this.setDay(day);
		//this.year = year;
		this.setYear(year);
	}
	
	public void setDay(int day) throws DateException {
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
	}
	
	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	
	private int getDaysOfMonth() {
		int numDays;
		
		numDays = 0;
		switch (this.month) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;			
		}
		
		return numDays;
	}
	
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}
	public boolean isSameYear(int year){
		if(this.year==year){return true;}
		else{return false;}
	}
	public boolean isSameMonth(int month){
		if(this.month==month){return true;}
		else{return false;}
	}
	public boolean isSameDay(int day){
		if(this.day==day){return true;}
		else{return false;}
	}
	public boolean isSame(String date){
		if(date==toString()){return true;}
		else{return false;}
	}
	public String nameMonth (){
		String uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce;
		uno = "enero";
		dos = "febrero";
		tres = "marzo";
		cuatro = "abril";
		cinco = "mayo";
		seis = "junio";
		siete = "julio";
		ocho = "agosto";
		nueve = "semptiembre";
		diez = "octubre";
		once = "noviembre";
		doce = "diciembre";
		if(this.month==1){return uno;}
		if(this.month==2){return dos;}
		if(this.month==3){return tres;}
		if(this.month==4){return cuatro;}
		if(this.month==5){return cinco;}
		if(this.month==6){return seis;}
		if(this.month==7){return siete;}
		if(this.month==8){return ocho;}
		if(this.month==9){return nueve;}
		if(this.month==10){return diez;}
		if(this.month==11){return once;}
		if(this.month==12){return doce;}
		else{return dos;}
	}
	public boolean isDayRight(){
		if(this.day>0){
			if(this.month<getDaysOfMonth()){
				return true;
			}
			else{return false;}
		}
		else{ return false;}
	}
	public String getEstacion(){
		if(this.month==1){return  "Invierno";}
		if(this.month==2){return  "Invierno";}
		if(this.month==3){if(this.day<20){return  "Invierno";}
	else{return  "Primavera";}}
		if(this.month==4){return  "Primavera";}
		if(this.month==5){return  "Primavera";}
		if(this.month==6){if(this.day<22){return  "Primavera";}
		else{return  "Verano";}}
		if(this.month==7){return "Verano";}
		if(this.month==8){return  "Verano";}
		if(this.month==9){if(this.day<23){return  "Verano";}
		else{return  "Otoño";}}
		if(this.month==10){return  "Otoño";}
		if(this.month==11){return  "Otoño";}
		if(this.month==12){if(this.day<22){return  "Otoño";}
		else{return  "Invierno";}}
		else{return "Introduzca un mes valido";}
	}
}