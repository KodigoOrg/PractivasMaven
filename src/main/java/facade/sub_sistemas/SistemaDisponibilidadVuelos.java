package facade.sub_sistemas;

public class SistemaDisponibilidadVuelos {
    public boolean verificarDisponibilidad(String destino, String fecha) {
        System.out.println("Verificacion de vuelo para " + destino + " el dia " + fecha);
        return true;
    }
}
