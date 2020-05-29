package datos;

import vista.imprimirObjetos;
import java.util.HashMap;

public class CuracionEstados extends Botiquin implements imprimirObjetos{

    private String categoria = "Curación Estados";
    

    public CuracionEstados(String nombre, int precio,String description) {
        super(nombre, precio, description);
    }
  

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Descripción: "+this.description);
    }
}
