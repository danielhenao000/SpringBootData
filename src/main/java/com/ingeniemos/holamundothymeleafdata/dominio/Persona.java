package com.ingeniemos.holamundothymeleafdata.dominio;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
}
