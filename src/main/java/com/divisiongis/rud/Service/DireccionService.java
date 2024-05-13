package com.divisiongis.rud.Service;

import com.divisiongis.rud.Entity.GeoJSON.FeatureCollection;
import com.divisiongis.rud.Entity.padrones_direcciones.DireccionVPD;

public interface DireccionService extends BaseService<DireccionVPD, Long> {
    public FeatureCollection getAllDirecciones() throws Exception;
}
