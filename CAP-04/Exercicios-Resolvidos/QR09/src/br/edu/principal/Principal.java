package br.edu.principal;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		int dia, mes, ano, hora, min;

		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		cal.setTime(d);
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH) + 1;
		ano = cal.get(Calendar.YEAR);
		
		System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " - ");
		
		switch (mes) {
		  case 1: 
			  System.out.println("janeiro");
			  break;
		  case 2: 
			  System.out.println("fevereiro");
			  break;
		  case 3: 
			  System.out.println("março");
			  break;
		  case 4: 
			  System.out.println("abril");
			  break;
		  case 5: 
			  System.out.println("maio");
			  break;
		  case 6: 
			  System.out.println("junho");
			  break;
		  case 7: 
			  System.out.println("julho");
			  break;
		  case 8: 
			  System.out.println("agosto");
			  break;
		  case 9: 
			  System.out.println("setembro");
			  break;
		  case 10: 
			  System.out.println("outubro");
			  break;
		  case 11: 
			  System.out.println("novembro");
			  break;
		  case 12: 
			  System.out.println("dezembro");
			  break;
		  default: System.out.println("month not found :/");
		}
		
		hora = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		
		System.out.print("Hora Atual: ");
		System.out.println(hora + ":" + min);
	}

}
