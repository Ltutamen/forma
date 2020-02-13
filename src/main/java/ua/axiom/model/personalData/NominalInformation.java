package ua.axiom.model.personalData;

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
}
