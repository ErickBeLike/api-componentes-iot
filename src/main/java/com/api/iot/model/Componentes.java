package com.api.iot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "componentes")
@Data
public class Componentes {

    @Id
    private String id;
    private String elemento;
    private Integer status;

}
