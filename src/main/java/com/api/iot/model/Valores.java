package com.api.iot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(value = "valores")
@Data
public class Valores {

    @Id
    private String id;
    private String elemento;
    private Integer valor;
    private LocalDateTime fecha = LocalDateTime.now();

}
