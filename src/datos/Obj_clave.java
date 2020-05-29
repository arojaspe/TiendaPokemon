package datos;

import vista.imprimirObjetos;

public class Obj_clave extends Producto implements imprimirObjetos {

    private String tipo = "Objetos Clave";

    public Obj_clave(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }
}
