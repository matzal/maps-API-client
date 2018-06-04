package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Geometry implements Serializable {

    private static final long serialVersionUID = 1L;
    private Bounds bounds;
    private LatLng location;
    private LocationType locationType;
    private Bounds viewport;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    @JsonProperty("location_type")
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public Bounds getViewport() {
        return viewport;
    }

    public void setViewport(Bounds viewport) {
        this.viewport = viewport;
    }
}