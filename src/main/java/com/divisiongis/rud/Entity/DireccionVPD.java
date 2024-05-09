package com.divisiongis.rud.Entity;

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
    private String RUD_direccion_nomencla;

    @Column
    private String RUD_parcela_nomencla;

    @Column
    private String PAD_padron_direccion_id;

    @Column
    private double RUD_direccion_x;

    @Column
    private double RUD_direccion_y;

}
