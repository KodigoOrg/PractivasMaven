package prototype.model.implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import prototype.interfaces.Telefono;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeaturePhone implements Telefono {
    private String marca;
    private String modelo;
    private int capacidadBateria;

    @Override
    public Telefono clonar() {
        try {
            return (FeaturePhone) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
