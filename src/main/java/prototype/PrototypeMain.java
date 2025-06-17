package prototype;

import prototype.model.implementation.FeaturePhone;
import prototype.model.implementation.Smartphone;

public class PrototypeMain {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple", "IPHONE 15");
        System.out.println("smartphone = " + smartphone);

        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310", 1200);
        System.out.println("featurePhone = " + featurePhone);

        Smartphone smartphone2 = (Smartphone) smartphone.clonar();
        FeaturePhone featurePhone2 = (FeaturePhone) featurePhone.clonar();

        smartphone2.setModelo("IPHONE 15 PRO");
        featurePhone2.setModelo("NOkia 3310");

        System.out.println("featurePhone2 = " + featurePhone2);
        System.out.println("featurePhone2 = " + featurePhone2);
        
    }
}
