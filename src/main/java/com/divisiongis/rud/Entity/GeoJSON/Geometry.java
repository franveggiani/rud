package com.divisiongis.rud.Entity.GeoJSON;

import lombok.Data;

@Data
public class Geometry {
    private String type;
    private Object coordinates;

    public Geometry(double latitude, double longitude) {
        this.type = "Point";
        this.coordinates = new double[]{longitude, latitude};
    }

    public Geometry(double[][] lineStringCoordinates) {
        this.type = "Line";
        this.coordinates = lineStringCoordinates;
    }

    public Geometry(double[][][] polygonCoordinates) {
        this.type = "Polygon";
        this.coordinates = polygonCoordinates;
    }

}
