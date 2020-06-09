package datos;

import visual.imprimirObjetos;

public class RecuperarVitalidad extends Botiquin implements imprimirObjetos {

    private String categoria = "Recuperar Vitalidad";

    public RecuperarVitalidad(String nombre, int precio, String description) {
        super(nombre, precio, description);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio() { return this.precio;}
    public String getDescription() {return this.description;}
}
