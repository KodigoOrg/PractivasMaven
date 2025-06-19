package facade.facades;

import facade.sub_sistemas.SistemaAsignacionAsiento;
import facade.sub_sistemas.SistemaDisponibilidadVuelos;
import facade.sub_sistemas.SistemaPago;
import facade.sub_sistemas.SistemaReservas;


public class GestionVuelosFacade {
    private SistemaAsignacionAsiento sistemaAsignacionAsiento;
    private SistemaDisponibilidadVuelos sistemaDisponibilidadVuelos;
    private SistemaPago sistemaPago;
    private SistemaReservas sistemaReservas;

    public GestionVuelosFacade() {
        this.sistemaAsignacionAsiento = new  SistemaAsignacionAsiento();
        this.sistemaDisponibilidadVuelos = new  SistemaDisponibilidadVuelos();
        this.sistemaPago = new  SistemaPago();
        this.sistemaReservas = new  SistemaReservas();
    }

  public void reservarVuelos(String nombreCliente, String destino, String fecha, double pago){
        if (sistemaDisponibilidadVuelos.verificarDisponibilidad(destino, fecha)){
            sistemaReservas.crearReservas(nombreCliente, destino, fecha);
            sistemaPago.procesoPago(nombreCliente, pago);
            sistemaAsignacionAsiento.asignarAsiento(nombreCliente);

            System.out.println("Reserva completada exitosamente para " + nombreCliente+ " para el dia "+ fecha);
        }
        else {
            System.out.println("Lo siento, no tenemos asientos disponibles");
        }
  }

}
