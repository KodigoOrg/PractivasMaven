package bridge.model.implementation;

import bridge.interfaces.Dispositivo;

public class Television implements Dispositivo {
    private boolean encendido = true;
    private int volumen =30;


    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Television encendida.");
    }

    @Override
    public void apagarse() {
        this.encendido = false;
        System.out.println("Television apagada.");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        this.volumen = volumen;
        System.out.println("Volumen de la televison a: " + volumen);
    }

    @Override
    public boolean estaApagado() {
        return encendido;
    }
}
