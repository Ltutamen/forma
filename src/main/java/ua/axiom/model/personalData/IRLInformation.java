package ua.axiom.model.personalData;

import java.util.Optional;

public class IRLInformation {
    private final String homePhone;
    private final String mobilePhone;
    private final Optional<String> secondPhone;

    public IRLInformation(String homePhone, String mobilePhone, Optional<String> secondPhone) {
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.secondPhone = secondPhone;
    }
}
