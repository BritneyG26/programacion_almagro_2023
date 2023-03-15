package javaucjc.ejercicioscondicionales;

public class lana {
	String calc_est(String mes){
		switch(mes) {
		    case "Enero":
		    case "Febrero":
		    case "Marzo":
		        return "Verano";
		     
		    case "Abril":
		    case "Mayo":
		    case "Junio":
		        return "Otoño";
		        
		    case "Julio":
		    case "Agosto":
		    case "Septiembre":
		        return "Invierno";
		        
		    case "Octubre":
		    case "Noviembre":
		    case "Diciembre":
		        return "Primavera";
		        
		    default:
		    	return "";
		    	       
		}
	}
}
