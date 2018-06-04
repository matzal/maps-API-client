package model;

public enum AddressComponentType {

    street_address("street_address"),
    route("route"),
    intersection("intersection"),
    political("political"),
    country("country"),
    administrative_area_level_1("administrative_area_level_1"),
    administrative_area_level_2("administrative_area_level_2"),
    administrative_area_level_3("administrative_area_level_3"),
    administrative_area_level_4("administrative_area_level_4"),
    administrative_area_level_5("administrative_area_level_5"),
    colloquial_area("colloquial_area"),
    locality("locality"),
    ward("ward"),
    sublocality("sublocality"),
    sublocality_level_1("sublocality_level_1"),
    sublocality_level_2("sublocality_level_2"),
    sublocality_level_3("sublocality_level_3"),
    sublocality_level_4("sublocality_level_4"),
    sublocality_level_5("sublocality_level_5"),
    neighborhood("neighborhood"),
    premise("premise"),
    subpremise("subpremise"),
    postal_code("postal_code"),
    postal_code_prefix("postal_code_prefix"),
    postal_code_suffix("postal_code_suffix"),
    natural_feature("natural_feature"),
    airport("airport"),
    park("park"),
    point_of_interest("point_of_interest"),
    floor("floor"),
    establishment("establishment"),
    parking("parking"),
    post_box("post_box"),
    postal_town("postal_town"),
    room("room"),
    street_number("street_number"),
    bus_station("bus_station"),
    train_station("train_station"),
    subway_station("subway_station"),
    transit_station("transit_station"),
    light_rail_station("light_rail_station"),
    unknown("unknown");

    public final String addressComponentType;

    AddressComponentType(final String addressComponentType) {
        this.addressComponentType = addressComponentType;
    }

    @Override
    public String toString() {
        return addressComponentType;
    }

    public String toCanonicalLiteral() {
        return toString();
    }
}
