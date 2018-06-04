package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AddressComponent implements Serializable {

    private static final long serialVersionUID = 1L;
    private String longName;
    private String shortName;
    private AddressComponentType[] types;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLongName() {
        return longName;
    }

    @JsonProperty("long_name")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public AddressComponentType[] getTypes() {
        return types;
    }

    public void setTypes(AddressComponentType[] types) {
        this.types = types;
    }
}