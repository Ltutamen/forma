package ua.axiom.model.personalData;

import java.util.Objects;

public class URLInformation {
    private final String eMail;
    private final String skype;

    public URLInformation(String eMail, String skype) {
        this.eMail = eMail;
        this.skype = skype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URLInformation that = (URLInformation) o;
        return eMail.equals(that.eMail) &&
                skype.equals(that.skype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eMail, skype);
    }
}
