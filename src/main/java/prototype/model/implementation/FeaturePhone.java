package prototype.model.implementation;

import prototype.interfaces.Telefono;

public class FeaturePhone implements Telefono {
    private String marca;
    private String modelo;
    private int capacidadBateria;

    public FeaturePhone(String marca, String modelo, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public Telefono clonar() {
        try {
            return (FeaturePhone) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
