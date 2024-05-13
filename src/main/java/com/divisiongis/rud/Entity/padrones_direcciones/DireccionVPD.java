package com.divisiongis.rud.Entity.padrones_direcciones;

import com.divisiongis.rud.Entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DireccionVPD extends BaseEntity{
    
    @Column
    private int PAD_padron_direccion_id;
    @Column
    private int PAD_padron_nro;
    @Column
    private int PAD_area_id;
    @Column
    private String PAD_area_descrip;
    @Column
    private int PAD_tipo_direccion_id;
    @Column
    private int PAD_tipo_estado_id;
    @Column
    private String PAD_tipo_direccion_descrip;
    @Column
    private int PAD_ultimo_usuario_id;
    @Column
    private String PAD_sistema_usuario;
    @Column
    private String RUD_direccion_nomencla;
    @Column
    private String RUD_parcela_nomencla;
    @Column
    private double RUD_direccion_x;
    @Column
    private double RUD_direccion_y;
    @Column
    private String RUD_provincia_nombre;
    @Column
    private String RUD_departamento_nombre;
    @Column
    private String RUD_distrito_nombre;
    @Column
    private int RUD_barrio_id;
    @Column
    private String RUD_barrio_nombre;
    @Column
    private String RUD_barrio_estado;
    @Column
    private String RUD_calle_id;
    @Column
    private String RUD_direccion_calle;
    @Column
    private int RUD_direccion_numeracion;
    @Column
    private int RUD_direccion_cp;
    @Column
    private String RUD_direccion_manzana;
    @Column
    private String RUD_direccion_casa;
    @Column
    private String RUD_direccion_local;
    @Column
    private String RUD_direccion_piso;
    @Column
    private String RUD_direccion_depto;
    @Column
    private String RUD_direccion_area;
    @Column
    private String RUD_direccion_torre;
    @Column
    private String RUD_direccion_lote;
    @Column
    private String RUD_direccion_observ;
    @Column
    private String RUD_direccion_f_alta;
    @Column
    private String RUD_direccion_f_modif;
    @Column
    private String RUD_usuario_nombre_alta;
    @Column
    private String RUD_usuario_nombre_modif;
    @Column
    private int RUD_direccion_id;
    @Column
    private String RUD_seccion_descrip;
    @Column
    private int RUD_direccion_forzada;
    @Column
    private int RUD_departamento_id;
    @Column
    private int RUD_provincia_id;
    @Column
    private String RUD_parcela_subparcela;
    @Column
    private int RUD_parcela_id;
    @Column
    private String RUD_parcela_estado;
    @Column
    private String GOOGLE_MAPS;
    @Column
    private String RUD_geom;
    @Column
    private String RUD_geometry;
    @Column
    private String RUD_homologacion;
    @Column
    private String RUD_estado_direccion;
    @Column
    private String RUD_estado_color;
    @Column
    private String RUD_direccion_ph_id;
    @Column
    private String RUD_cantidad_ph;
}
