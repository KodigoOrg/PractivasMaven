package flyweight.app;

import flyweight.factory.HeroFactory;
import flyweight.model.HeroAttributes;
import flyweight.model.HeroInstance;

public class DotaMain {
    public static void main(String[] args) {
        HeroAttributes linaAtributes = HeroFactory.getHeroAttribute("Lina", "Guerrero", 800, 200);
        HeroAttributes JuggernautAttributes = HeroFactory.getHeroAttribute("Juggernaut", "Guerrero", 1000, 150);

        HeroInstance lina1 = new HeroInstance(linaAtributes, 800, 200);
        HeroInstance lina2 = new HeroInstance(linaAtributes, 500, 175);

        HeroInstance juggernaut1 = new HeroInstance(JuggernautAttributes, 1200, 150);

        lina1.showStatus();
        lina2.showStatus();

        juggernaut1.showStatus();

        lina2.castSpell(100);
        lina2.showStatus();

    }

}
