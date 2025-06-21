package flyweight.factory;

import flyweight.model.HeroAttributes;

import java.util.HashMap;
import java.util.Map;

public class HeroFactory {
    private static final Map<String, HeroAttributes> heroMap = new HashMap<>();

    public HeroFactory() {
    }

    public static HeroAttributes getHeroAttribute(String name, String role, int baseHelth, int baseMana ){
        HeroAttributes hero = heroMap.get(name);

        if(hero == null){
            hero  = new HeroAttributes(name, role, baseHelth, baseMana);
            heroMap.put(name, hero);
        }
        return hero;
    }
}
