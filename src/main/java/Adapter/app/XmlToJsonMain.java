package Adapter.app;

import Adapter.adapters.XmlToJsonAdapter;
import Adapter.external.XmlDataProvider;
import Adapter.interfaces.JsonData;

public class XmlToJsonMain {
    public static void main(String[] args) {
        try {
            XmlDataProvider xmlDataProvider = new XmlDataProvider("src/main/java/Adapter/resources/Users.xml");
            JsonData adapter = new XmlToJsonAdapter(xmlDataProvider);

            System.out.println("Json Output");
            System.out.println(adapter.getJson());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
