package com.divisiongis.rud.Entity.GeoJSON;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.HashMap;
import java.util.Map;


@Data
public class Feature {

    private Geometry geometry;
    private Map<String, Object> properties;

    public Feature() {
        this.properties = new HashMap<>();
    }

    public Feature(Geometry geometry, Map<String, Object> properties){
        this.properties = properties;
        this.geometry = geometry;
    }

    public void addProperties(String key, Object value){
        properties.put(key, value);
    }

}
