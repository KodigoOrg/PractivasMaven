package bridge;

import bridge.interfaces.Dispositivo;
import bridge.model.ControlRemoto;
import bridge.model.ControlRemotoAvanzado;
import bridge.model.implementation.Radio;
import bridge.model.implementation.Television;

public class BrindgeMain {

    public static void main(String[] args) {
        Dispositivo television = new Television();
        Dispositivo radio = new Radio();

        ControlRemoto controlRemoto = new ControlRemoto(television);
        ControlRemotoAvanzado avanzado = new ControlRemotoAvanzado(radio);

        controlRemoto.ajustarVolumen(50);
        avanzado.ajustarVolumen(100);

        avanzado.silenciar();
    }
}
