package prototype.model.implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import prototype.interfaces.Telefono;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone implements Telefono {
    private String marca;
    private String modelo;

    @Override
    public Telefono clonar() {
        try {
            return (Smartphone) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
