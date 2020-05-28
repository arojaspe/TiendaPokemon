package datos;

import vista.imprimirObjetos;

public class MejorarEstadisticas extends Producto implements imprimirObjetos {

    private String categoria = " Mejora de estadísticas";

    public MejorarEstadisticas(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }
}