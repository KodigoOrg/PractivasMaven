package decorate.decorators;

import decorate.core.Jugador;

public class EspecialistaPenalesDecorator extends JugadorDecordor{
    public EspecialistaPenalesDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " y es un especialista en penales";
    }
}
