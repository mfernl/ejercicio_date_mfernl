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
		if(date.equals(toString())){return true;}
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
	public int monthsLeft(){
		int mesesRestantes;
		mesesRestantes = 12 - this.month;
		return mesesRestantes;
	}
	public String daysLeft(){
		int diasRestantes;
		String fechasRestantes = "";
		diasRestantes = getDaysOfMonth() - this.day;
		for(int i=0;i<=diasRestantes;i++){
			fechasRestantes = fechasRestantes + " "+(this.day+i)+"/"+this.month+"/"+this.year+" ";
		}
		return fechasRestantes;
	}
	public String sameNumberOfDays(){
		String mesesIgualDuracion = "";
		switch (this.month) {
			case 1: 
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Marzo Mayo Julio Agosto Octubre Diciembre";
				break;
			case 3:
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Mayo Julio Agosto Octubre Diciembre";
				break;
			case 5: 
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Marzo Julio Agosto Octubre Diciembre";
				break;
			case 7: 
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Marzo Mayo Agosto Octubre Diciembre";
				break;
			case 8: 
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Marzo Mayo Julio Octubre Diciembre";
				break;
			case 10: 
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Marzo Mayo Julio Agosto Diciembre";
				break;
			case 12:
				mesesIgualDuracion = "Los meses que tienen los mismos dias son Enero Marzo Mayo Julio Agosto Octube";
				break;
			case 4:
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Junio Septiembre Noviembre ";
			break;
			case 6:
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Abril Septiembre Noviembre ";
			break;
			case 9:
			mesesIgualDuracion = "Los meses que tienen los mismos dias son Abril Junio Noviembre ";
			break;
			case 11:
				mesesIgualDuracion = "Los meses que tienen los mismos dias son Abril Junio Septiembre ";
				break;
			case 2:
				mesesIgualDuracion = "Febrero es único";
				break;			
			}
			return mesesIgualDuracion;
	}
	public int daysPassed(){
		int numDays2 = 0;
		int numDays = 0;
		switch (this.month) {
			case 1:
			numDays = 31;
			break; 
			case 3:
			numDays = 28+(2*31);
			break; 
			case 5:
			numDays = 28+1*30+3*31;
			break; 
			case 7:
			numDays = 28+2*30+4*31;
			break; 
			case 8:
			numDays = 28+2*30+5*31;
			break; 
			case 10: 
			numDays = 28+3*30+6*31;
			break;
			case 12:
				numDays = 28+4*30+7*31;
				break;
			case 4:
			numDays = 28+30+2*31;
			break;
			case 6:
			numDays = 28+2*30+3*31;
			break;
			case 9:
			numDays = 28+3*30+5*31;
			break;
			case 11:
				numDays = 28+4*30+6*31;
				break;
			case 2:
				numDays = 31+28;
				break;			
			}
		numDays2 = getDaysOfMonth() - this.day;
		int diasMes = getDaysOfMonth() - numDays2;
		int diasDeAño = diasMes + numDays;
		return diasDeAño;
	}
	public int attemtsToFindDate(){
		int intentos = 0;
		String fechaRandom = "";
		while(!fechaRandom.equals(toString())){
			fechaRandom = ((int)(Math.random()*30)+1)+"/"+((int)(Math.random()*11)+1)+"/"+this.year;
			intentos++;
		}
		return intentos;
	}
	public int attemtsToFindDate2(){
		int intentos = 0;
		String fechaRandom = "";
		do{
			fechaRandom = ((int)(Math.random()*30)+1)+"/"+((int)(Math.random()*11)+1)+"/"+this.year;
			intentos++;
		}while(!fechaRandom.equals(toString()));
		return intentos;
	}
	public String diaDeLaSemana(){
			int a = (int)((this.year-2000)/4)+this.year-2000;
			int b = 0;
			if(this.month==1){b=6;}
			if(this.month==2){b=2;}
			if(this.month==3){b=2;}
			if(this.month==4){b=5;}
			if(this.month==5){b=0;}
			if(this.month==6){b=3;}
			if(this.month==7){b=5;}
			if(this.month==8){b=1;}
			if(this.month==9){b=4;}
			if(this.month==10){b=6;}
			if(this.month==11){b=2;}
			if(this.month==12){b=4;}
			int c = this.day;
			int dia =a+b+c;
			while(dia>7){
				dia=dia-7;
			}
			if(dia==1){return "Lunes";}
			if(dia==2){return "Martes";}
			if(dia==3){return "Miercoles";}
			if(dia==4){return "Jueves";}
			if(dia==5){return "Viernes";}
			if(dia==6){return "Sabado";}
			if(dia==0){return "Domingo";}
			return "introduza una fecha correcta";
	}
}