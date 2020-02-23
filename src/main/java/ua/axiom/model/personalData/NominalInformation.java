package ua.axiom.model.personalData;

import java.util.Objects;

public class NominalInformation {

    private final String surname;
    private final String name;
    private final String patronymic;
    private final String nickName;

    public NominalInformation(String surname, String name, String nickName, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.nickName = nickName;
        this.patronymic = patronymic;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NominalInformation that = (NominalInformation) o;
        return surname.equals(that.surname) &&
                name.equals(that.name) &&
                patronymic.equals(that.patronymic) &&
                nickName.equals(that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, nickName);
    }
}
