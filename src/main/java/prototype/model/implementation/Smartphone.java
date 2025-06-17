package prototype.model.implementation;

import prototype.interfaces.Telefono;

public class Smartphone implements Telefono {
    private String marca;
    private String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Telefono clonar() {
        try {
            return (Smartphone) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
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
}
