package ua.axiom.model.personalData;

import java.util.Optional;

public class IRLInformation {
    private final String homePhone;
    private final String mobilePhone;
    private final Optional<String> secondPhone;

    public IRLInformation(String homePhone, String mobilePhone, String secondPhone) {
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.secondPhone = secondPhone.length() > 6 ? Optional.of(secondPhone) : Optional.empty();
    }
}
