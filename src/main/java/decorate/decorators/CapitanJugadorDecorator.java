package decorate.decorators;

import decorate.core.Jugador;

public class CapitanJugadorDecorator extends  JugadorDecordor{
    public CapitanJugadorDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " y es el capitan" ;
    }
}
