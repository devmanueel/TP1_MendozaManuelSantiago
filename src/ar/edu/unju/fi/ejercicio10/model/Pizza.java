package ar.edu.unju.fi.ejercicio10.model;


public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingredientesEspeciales;
	private final int IESPECIAL_20 = 500; 
	private final int IESPECIAL_30 = 750;
	private final int IESPECIAL_40 = 1000;
	
	public int calcularPrecio() {
		switch(diametro) {
		case 20:
			precio=4500;
			if(ingredientesEspeciales==true) {
				precio=precio+IESPECIAL_20;
			}
			return precio;
		case 30:
			precio=4800;
			if(ingredientesEspeciales==true) {
				precio=precio+IESPECIAL_30;
			}
			return precio;
		case 40:
			precio = 5500;
			if(ingredientesEspeciales==true) {
				 precio=precio + IESPECIAL_40;
			}
			return precio;
		}
		return 0;
	}
	
	public void calcularArea() {
		double radio= diametro/2;
		area= Math.PI * Math.pow(radio, 2);
	}
	
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Diametro = " + diametro + "\nIngredientes Especiales = "
				+ ingredientesEspeciales +"\nPrecio = $" + precio + "\nArea de la pizza = " + area;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	


}