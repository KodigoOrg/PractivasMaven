package bridge.model;

import bridge.interfaces.Dispositivo;

public class ControlRemotoAvanzado extends ControlRemoto{

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar(){
        System.out.println("Dispositivo silenciado.");
        dispositivo.ajustarVolumen(0);
    }
}
