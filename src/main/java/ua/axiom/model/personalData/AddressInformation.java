package ua.axiom.model.personalData;

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
}
