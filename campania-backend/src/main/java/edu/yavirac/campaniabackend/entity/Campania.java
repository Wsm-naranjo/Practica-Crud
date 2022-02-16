package edu.yavirac.campaniabackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("campania_publicitaria")
public class Campania {

    @Id
    @Column("campania_id")
    private long campaniaId;
    private String nombre;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFinalizacion;
    private String descripcion;
    private Boolean estado;

    
}
