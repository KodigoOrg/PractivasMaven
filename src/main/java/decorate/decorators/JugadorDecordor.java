package decorate.decorators;

import decorate.core.Jugador;

public abstract class JugadorDecordor extends Jugador {

    public Jugador jugador;

    public JugadorDecordor( Jugador jugador) {
        super(jugador.nombre, jugador.posicion);
        this.jugador = jugador;
    }

    @Override
    public abstract String obtenerHabilidades();
}
