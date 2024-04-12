package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
		
	}
	
	public int calcularSumatoria() {
	int sumaTotal = 0;
	int terminoSumatoria=0;
	for (int i = 1; i <= n; i++) {
	    terminoSumatoria = (i * (i + 1)) / 2;
	    sumaTotal += Math.pow(terminoSumatoria, 2);
	    }
	    return sumaTotal;
	}
	
	public int calcularProductoria() {
		int produc =1;
		for (int k=1; k<=n; k++) {
			produc*=(k*(k+4));
		}
		return produc;
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
