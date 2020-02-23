package ua.axiom.model.personalData;

import java.util.Objects;

public class AddressInformation {
    private String city;
    private String street;
    private String building;
    private int flatNumber;
    private int postcode;

    public AddressInformation(String city, String street, String building, int flatNumber, int postcode) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.flatNumber = flatNumber;
        this.postcode = postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressInformation that = (AddressInformation) o;
        return flatNumber == that.flatNumber &&
                postcode == that.postcode &&
                city.equals(that.city) &&
                street.equals(that.street) &&
                building.equals(that.building);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, building, flatNumber, postcode);
    }
}
