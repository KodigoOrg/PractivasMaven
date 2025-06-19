package decorate.core;

public class JugadorElSalvador  extends Jugador{

    public JugadorElSalvador(String nombre, String posicion) {
        super(nombre, posicion);
    }

    @Override
    public String obtenerHabilidades() {
        return nombre + " juega en la posicion " + posicion;
    }
}
