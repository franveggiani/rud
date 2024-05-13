package com.divisiongis.rud.Repository.padrones_direcciones;

import com.divisiongis.rud.Entity.patrones_direcciones.DireccionVPD;
import com.divisiongis.rud.Repository.BaseRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepository extends BaseRepository<DireccionVPD, Long> {

    @Query(value = "SELECT RUD_direccion_id AS id, RUD_direccion_nomencla, RUD_parcela_nomencla, PAD_padron_direccion_id, RUD_direccion_x, RUD_direccion_y FROM vpadrones_direcciones WHERE RUD_direccion_x IS NOT NULL OR RUD_direccion_y IS NOT NULL", nativeQuery = true)
    List<DireccionVPD> getAllDirecciones();

}
