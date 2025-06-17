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

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadBateria=" + capacidadBateria +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
}
