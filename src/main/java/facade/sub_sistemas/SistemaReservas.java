package facade.sub_sistemas;

public class SistemaReservas {
    public void crearReservas(String nombreCliente, String destino, String fecha){
        System.out.println("Reserva creada para " +  nombreCliente + " con destino a " + destino
            + " el dia " + fecha
        );
    }
}
