package ar.edu.unju.fi;

public class Principal {
	
	public static void main(String[] args) {
		
		int i=0;
		int enumeracion=20;
		for (int j=10; i < 8;j+=10) {
			enumeracion += j;
			System.out.println("Enumeracion "+(i+1)+" ="+enumeracion);
			i++;
		}
	
    }
}
