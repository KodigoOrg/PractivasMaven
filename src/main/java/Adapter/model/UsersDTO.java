package Adapter.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public record UsersDTO(
     @JacksonXmlElementWrapper(useWrapping = false) List<UserDTO> user
){}
