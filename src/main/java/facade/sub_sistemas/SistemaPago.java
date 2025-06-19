package facade.sub_sistemas;

public class SistemaPago {
    public void procesoPago(String nombreCliente, double pago){
        System.out.println("Procesando pago de $"+pago + " para " + nombreCliente);
    }
}
