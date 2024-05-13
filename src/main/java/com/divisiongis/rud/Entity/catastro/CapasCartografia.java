package com.divisiongis.rud.Entity.catastro;

import com.divisiongis.rud.Entity.BaseEntity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CapasCartografia extends BaseEntity{

    private String nombre;
    private String nombreVisible;
    private String nombreDb;
    private String tipo;
    private String espacioTrabajo;
    private String formato;
    private String version;
    private boolean tiled;
    private String style;
    private String cqlFilter;
    private boolean visible;
    private double opacidad;
    private String grupo;
    private int orden;
    private String siglaDependencia;
    private int leyendaVisible;
    private int leyendaOrden;
    private int leyendaAcordeon;
    private String observacionesCartografia;

}
