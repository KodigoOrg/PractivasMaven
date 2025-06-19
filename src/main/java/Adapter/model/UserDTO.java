package Adapter.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record UserDTO(
       @JacksonXmlProperty(localName = "name") String nombre,
       @JacksonXmlProperty(localName = "age") int age
) {}
