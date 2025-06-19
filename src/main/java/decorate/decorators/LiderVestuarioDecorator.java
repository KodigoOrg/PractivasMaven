package decorate.decorators;

import decorate.core.Jugador;

public class LiderVestuarioDecorator extends JugadorDecordor{
    public LiderVestuarioDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " y es un lider en el vestuario";
    }
}
