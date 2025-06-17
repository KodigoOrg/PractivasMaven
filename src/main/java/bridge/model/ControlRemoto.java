package bridge.model;

import bridge.interfaces.Dispositivo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ControlRemoto {
    protected Dispositivo dispositivo;

    public void encender(){
        dispositivo.encender();
    }

    public void apagar(){
        dispositivo.apagarse();
    }

    public void ajustarVolumen(int volumen){
        dispositivo.ajustarVolumen(volumen);
    }
}
