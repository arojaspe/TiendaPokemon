package datos;

import visual.imprimirObjetos;

public class Bayas extends Producto implements imprimirObjetos {
	private String tipo = "Bayas";

	public Bayas(String nombre, int precio, String description) {
		super(nombre, precio, description);
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Precio: "+this.precio);
		System.out.println("Descripci�n: "+this.description);
	}
}