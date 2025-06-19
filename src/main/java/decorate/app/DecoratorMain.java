package decorate.app;

import decorate.core.Jugador;
import decorate.core.JugadorElSalvador;
import decorate.decorators.CapitanJugadorDecorator;
import decorate.decorators.EspecialistaPenalesDecorator;
import decorate.decorators.LiderVestuarioDecorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Jugador jugador = new JugadorElSalvador("Magico Gonsales", "de todo");

        jugador = new CapitanJugadorDecorator(jugador);
        jugador = new EspecialistaPenalesDecorator(jugador);

        System.out.println(jugador.obtenerHabilidades() );
        Jugador jugador2 = new JugadorElSalvador("Madara", "Delantero");

        jugador2 = new LiderVestuarioDecorator(jugador2);

        System.out.println(jugador2.obtenerHabilidades() );
    }
}
