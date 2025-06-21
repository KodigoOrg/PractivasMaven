package flyweight.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HeroAttributes {
    private String name;
    private String role;
    private int baseHealh;
    private int baseMana;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", baseHealh=" + baseHealh +
                ", baseMana=" + baseMana +
                '}';
    }
}
