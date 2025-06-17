package composite.model.implementation;

import composite.interfaces.UnidadPolicial;

import java.util.ArrayList;
import java.util.List;


public class JefePolicia implements UnidadPolicial {
    private String nombre;
    private String rango;
    private List<Policia> subordinado;

    public JefePolicia(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
        this.subordinado = new ArrayList<>();
    }

    @Override
    public void mostrarDetalles() {
         System.out.println("Policia: " + this.nombre + ", Rango: " + this.rango);
         subordinado.forEach(Policia::mostrarDetalles);
    }
}
