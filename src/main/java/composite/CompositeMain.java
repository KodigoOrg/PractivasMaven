package composite;

import composite.model.implementation.JefePolicia;
import composite.model.implementation.Policia;

public class CompositeMain {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Walter", "Patrullero");
        Policia policia2 = new Policia("Kevin", "Patrullero");
        Policia policia3 = new Policia("Joel", "Motorizado");

        JefePolicia jefePolicia1 = new JefePolicia("Oscar", "Jefe Policial");
        JefePolicia jefePolicia2 = new JefePolicia("Ignacio", "Jefe policial");

        jefePolicia2.agregarSubordinado(policia1);
        jefePolicia2.agregarSubordinado(policia2);

        jefePolicia1.agregarSubordinado(policia3);

        jefePolicia1.mostrarDetalles();
        System.out.println("\n");
        jefePolicia2.mostrarDetalles();

    }
}
