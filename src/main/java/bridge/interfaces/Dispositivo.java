package bridge.interfaces;

public interface Dispositivo {
    void encender();
    void apagarse();
    void ajustarVolumen(int volumen);
    boolean estaApagado();
}
