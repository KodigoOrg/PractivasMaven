package Adapter.adapters;

import Adapter.external.XmlDataProvider;
import Adapter.interfaces.JsonData;
import Adapter.model.UsersDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlToJsonAdapter implements JsonData {
    private XmlDataProvider xmlDataProvider;

    public XmlToJsonAdapter(XmlDataProvider xmlDataProvider) {
        this.xmlDataProvider = xmlDataProvider;
    }

    @Override
    public String getJson() {
        try {
            String xml = xmlDataProvider.getXml();

            XmlMapper xmlMapper = new XmlMapper();

            UsersDTO users = xmlMapper.readValue(xml, UsersDTO.class);

            ObjectMapper  jsonMapper = new ObjectMapper();

            return jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
        } catch (Exception e) {
            e.printStackTrace();
             return "{}";
        }


    }
}
