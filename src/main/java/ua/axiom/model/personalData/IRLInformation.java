package ua.axiom.model.personalData;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IRLInformation that = (IRLInformation) o;
        return homePhone.equals(that.homePhone) &&
                mobilePhone.equals(that.mobilePhone) &&
                secondPhone.equals(that.secondPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homePhone, mobilePhone, secondPhone);
    }
}
