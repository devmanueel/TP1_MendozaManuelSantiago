package ar.edu.unju.fi.ejercicio11;

public class main {	
	public static void main(String[] args) {
		int i=2, j, val=0, desc=1;
		boolean bandera =true;
		for(j=40; j>=0; j--) {
			if(bandera){
				   val = j*i;
				   bandera=false; 
				   desc+=i;
			}
			else {
				System.out.println(val);
				val+=(40-desc);
				desc+=i;
			}
		}
		System.out.println(j);
	}	
}

