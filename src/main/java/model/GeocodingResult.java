package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class GeocodingResult implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<AddressComponent> addressComponents;
    private String formattedAddress;
    private String[] postcodeLocalities;
    private Geometry geometry;
    private AddressType[] types;
    private boolean partialMatch;
    private String placeId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    @JsonProperty("address_components")
    public void setAddressComponents(List<AddressComponent> addressComponents) {
        this.addressComponents = addressComponents;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    @JsonProperty("formatted_address")
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String[] getPostcodeLocalities() {
        return postcodeLocalities;
    }

    @JsonProperty("postcode_localities")
    public void setPostcodeLocalities(String[] postcodeLocalities) {
        this.postcodeLocalities = postcodeLocalities;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public AddressType[] getTypes() {
        return types;
    }

    public void setTypes(AddressType[] types) {
        this.types = types;
    }

    public boolean isPartialMatch() {
        return partialMatch;
    }

    @JsonProperty("partial_match")
    public void setPartialMatch(boolean partialMatch) {
        this.partialMatch = partialMatch;
    }

    public String getPlaceId() {
        return placeId;
    }

    @JsonProperty("place_id")
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
}