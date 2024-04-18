package ar.edu.unju.fi.ejercicio12.model;


import java.util.Calendar;


public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	//metodos
	 public int calcularEdad() {
	        Calendar hoy = Calendar.getInstance();
	        
	        int fechaHoy = hoy.get(Calendar.YEAR);
	        int fNacimiento = fechaNacimiento.get(Calendar.YEAR);
	        int edad = fechaHoy - fNacimiento;
	        //condición para ajustar correctamente la edad en casos donde aún no se ha alcanzado el día de cumpleaños de la persona en el año actual.
	        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
	            edad--;
	        }
	        return edad;
	    }

	    public String obtenerSignoZodiaco() {
	        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 
	        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	        String signoZodiaco = "";
	        switch (mes) {
	        case 3:
	            if (dia >= 21) {
	                signoZodiaco = "Aries";
	            } else {
	                signoZodiaco = "Piscis";
	            }
	            break;
	        case 4:
	            if (dia <= 20) {
	                signoZodiaco = "Aries";
	            } else {
	                signoZodiaco = "Tauro";
	            }
	            break;
	        case 5:
	            if (dia <= 20) {
	                signoZodiaco = "Tauro";
	            } else {
	                signoZodiaco = "Géminis";
	            }
	            break;
	        case 6:
	            if (dia <= 21) {
	                signoZodiaco = "Géminis";
	            } else {
	                signoZodiaco = "Cáncer";
	            }
	            break;
	        case 7:
	            if (dia <= 22) {
	                signoZodiaco = "Cáncer";
	            } else {
	                signoZodiaco = "Leo";
	            }
	            break;
	        case 8:
	            if (dia <= 23) {
	                signoZodiaco = "Leo";
	            } else {
	                signoZodiaco = "Virgo";
	            }
	            break;
	        case 9:
	            if (dia <= 23) {
	                signoZodiaco = "Virgo";
	            } else {
	                signoZodiaco = "Libra";
	            }
	            break;
	        case 10:
	            if (dia <= 23) {
	                signoZodiaco = "Libra";
	            } else {
	                signoZodiaco = "Escorpio";
	            }
	            break;
	        case 11:
	            if (dia <= 22) {
	                signoZodiaco = "Escorpio";
	            } else {
	                signoZodiaco = "Sagitario";
	            }
	            break;
	        case 12:
	            if (dia <= 21) {
	                signoZodiaco = "Sagitario";
	            } else {
	                signoZodiaco = "Capricornio";
	            }
	            break;
	        case 1:
	            if (dia <= 20) {
	                signoZodiaco = "Capricornio";
	            } else {
	                signoZodiaco = "Acuario";
	            }
	            break;
	        case 2:
	            if (dia <= 19) {
	                signoZodiaco = "Acuario";
	            } else {
	                signoZodiaco = "Piscis";
	            }
	            break;
	        default:
	            signoZodiaco = "Error: Mes inválido";
	    }

	    return signoZodiaco;
	    }
	 
	    public String obtenerEstacion() {
	    	int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 
	        if (mes == 1 && dia >=1 && dia <=31) {
				return "Verano";
			}else if(mes==2 && dia>=1 && dia <=28) {
				return "Verano";
			}else if (mes==3 && dia>=1 && dia <=20) {
				return "Verano";
			}else if (mes==3 && dia>=21 && dia <=31) {
				return "Otoño";
			}else if (mes==4 && dia>=1 && dia <=30) {
				return "Otoño";
			}else if (mes==5 && dia>=1 && dia <=31) {
				return "Otoño";
			}else if (mes==6 && dia>=1 && dia <=20) {
				return "Otoño";
			}else if (mes==6 && dia>=21 && dia <=30) {
				return "Invierno";
			}else if (mes==7 && dia>=1 && dia <=31) {
				return "Invierno";
			}else if (mes==8 && dia>=1 && dia <=31) {
				return "Invierno";
			}else if (mes==9 && dia>=1 && dia <=20) {
				return "Invierno";
			}else if (mes==9 && dia>=21 && dia <=30) {
				return "Primavera ";
			}else if (mes==10 && dia>=1 && dia <=31) {
				return "Primavera ";
			}else if (mes==11 && dia>=1 && dia <=30) {
				return "Primavera ";
			}else if (mes==12 && dia>=1 && dia <=22) {
				return "Primavera ";
			}else if (mes==12 && dia>=21 && dia <=31) {
				return "Verano";
			}else {
				return"Fecha Incorrecta";
			}
	    }

	    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
