package com.divisiongis.rud.Service;

import com.divisiongis.rud.Entity.DireccionVPD;
import com.divisiongis.rud.Entity.GeoJSON.FeatureCollection;

public interface DireccionService extends BaseService<DireccionVPD, Long> {
    public FeatureCollection getAllDirecciones() throws Exception;
}
