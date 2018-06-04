package model;

import java.io.Serializable;

public class Bounds implements Serializable {

    private static final long serialVersionUID = 1L;
    private LatLng northeast;
    private LatLng southwest;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LatLng getNortheast() {
        return northeast;
    }

    public void setNortheast(LatLng northeast) {
        this.northeast = northeast;
    }

    public LatLng getSouthwest() {
        return southwest;
    }

    public void setSouthwest(LatLng southwest) {
        this.southwest = southwest;
    }
}
