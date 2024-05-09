package com.divisiongis.rud.Entity.GeoJSON;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class FeatureCollection {

    public String type;
    public List<Feature> features = new ArrayList<>();

    public FeatureCollection(List<Feature> featureList){
        this.type = "FeatureCollection";
        this.features = featureList;
    }

    public FeatureCollection(){
        this.type = "FeatureCollection";
    }

    public void addFeature(Feature feature){
        this.features.add(feature);
    }

}
