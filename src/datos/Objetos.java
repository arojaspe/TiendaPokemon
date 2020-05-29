package datos;

import vista.imprimirObjetos;

public class Objetos extends Producto implements imprimirObjetos {

	private String tipo = "Objeto";

	public Objetos(String nombre, int precio, String description) {
		super(nombre, precio, description);
	}

	@Override
	public void mostrar() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Precio: "+this.precio);
		System.out.println("Descripción: "+this.description);
	}
}
