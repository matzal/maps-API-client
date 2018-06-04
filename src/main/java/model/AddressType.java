package model;

public enum AddressType implements UrlValue {

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
    natural_feature("natural_feature"),
    airport("airport"),
    university("university"),
    park("park"),
    museum("museum"),
    point_of_interest("point_of_interest"),
    establishment("establishment"),
    bus_station("bus_station"),
    train_station("train_station"),
    subway_station("subway_station"),
    transit_station("transit_station"),
    light_rail_station("light_rail_station"),
    church("church"),
    finance("finance"),
    post_office("post_office"),
    place_of_worship("place_of_worship"),
    postal_town("postal_town"),
    synagogue("synagogue"),
    food("food"),
    grocery_or_supermarket("grocery_or_supermarket"),
    store("store"),
    lawyer("lawyer"),
    health("health"),
    insurance_agency("insurance_agency"),
    gas_station("gas_station"),
    car_dealer("car_dealer"),
    car_repair("car_repair"),
    meal_takeaway("meal_takeaway"),
    furniture_store("furniture_store"),
    home_goods_store("home_goods_store"),
    shopping_mall("shopping_mall"),
    gym("gym"),
    accounting("accounting"),
    moving_company("moving_company"),
    lodging("lodging"),
    storage("storage"),
    casino("casino"),
    parking("parking"),
    stadium("stadium"),
    travel_agency("travel_agency"),
    night_club("night_club"),
    beauty_salon("beauty_salon"),
    hair_care("hair_care"),
    spa("spa"),
    shoe_store("shoe_store"),
    bakery("bakery"),
    pharmacy("pharmacy"),
    school("school"),
    book_store("book_store"),
    department_store("department_store"),
    restaurant("restaurant"),
    real_estate_agency("real_estate_agency"),
    bar("bar"),
    doctor("doctor"),
    hospital("hospital"),
    fire_station("fire_station"),
    supermarket("supermarket"),
    city_hall("city_hall"),
    local_government_office("local_government_office"),
    atm("atm"),
    bank("bank"),
    library("library"),
    unknown("unknown");

    private final String addressType;

    AddressType(final String addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return addressType;
    }

    public String toCanonicalLiteral() {
        return toString();
    }

    @Override
    public String toUrlValue() {
        if (this == unknown) {
            throw new UnsupportedOperationException("Shouldn't use AddressType.unknown in a request.");
        }
        return addressType;
    }
}
