package facade.app;

import facade.facades.GestionVuelosFacade;

public class FacadeMain {
    public static void main(String[] args) {
        GestionVuelosFacade gestion  = new GestionVuelosFacade();

        gestion.reservarVuelos("Francia" , "Paris", "19-06-2025", 1300);
    }
}
