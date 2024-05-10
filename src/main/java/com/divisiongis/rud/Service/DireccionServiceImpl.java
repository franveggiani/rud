package com.divisiongis.rud.Service;

import com.divisiongis.rud.Entity.DireccionVPD;
import com.divisiongis.rud.Entity.GeoJSON.Feature;
import com.divisiongis.rud.Entity.GeoJSON.FeatureCollection;
import com.divisiongis.rud.Entity.GeoJSON.Geometry;
import com.divisiongis.rud.Repository.BaseRepository;
import com.divisiongis.rud.Repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DireccionServiceImpl extends BaseServiceImpl<DireccionVPD, Long> implements DireccionService {

    @Autowired
    protected DireccionRepository direccionRepository;

    public DireccionServiceImpl(BaseRepository baseRepository, DireccionRepository direccionRepository) {
        super(baseRepository);
        this.direccionRepository = direccionRepository;
    }

    @Override
    public FeatureCollection getAllDirecciones() throws Exception{
        try {
            FeatureCollection featureCollection = new FeatureCollection();

            List<DireccionVPD> direccionList = direccionRepository.getAllDirecciones();

            direccionList.forEach(direccion -> {
                Geometry geometry = new Geometry(direccion.getRUD_direccion_x(), direccion.getRUD_direccion_y());

                Map<String ,Object> direccionProperties = new HashMap<>();

                direccionProperties.put("nomenclatura", direccion.getRUD_direccion_nomencla());
                direccionProperties.put("nomenclaturaParcela", direccion.getRUD_parcela_nomencla());
                direccionProperties.put("padronParcela", direccion.getPAD_padron_direccion_id());
                //Agregar más propiedades según sea necesario

                Feature feature = new Feature(geometry, direccionProperties);

                featureCollection.addFeature(feature);
            });

            return featureCollection;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
