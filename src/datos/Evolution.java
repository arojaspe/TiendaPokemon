package datos;

import vista.imprimirObjetos;

public class Evolution extends Producto implements imprimirObjetos {
    public Evolution(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }
}
