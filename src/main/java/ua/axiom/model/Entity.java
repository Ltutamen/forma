package ua.axiom.model;

import ua.axiom.model.personalData.*;

import java.time.LocalDateTime;
import java.util.Objects;


public class Entity {
    public enum ENTITY_GROUP {FAMILY, WORK, FRIENDS}

    public final String login;
    public final String name;
    public final String password;

    /*
    private final NominalInformation nominalInformation;
    private final URLInformation urlInformation;
    private final IRLInformation irlInformation;
    private final AddressInformation addressInformation;
    private String address;
    private final LocalDateTime addAt;
    private LocalDateTime lastModification;
    private String comment;
    private final ENTITY_GROUP group;

    private final String pasword;

    */

    public String getLogin() {
        return login;
    }

    /*
    public Entity(NominalInformation nominalInformation, URLInformation urlInformation, IRLInformation irlInformation, AddressInformation addressInformation, ENTITY_GROUP group, String pasword) {
        this.nominalInformation = nominalInformation;
        this.urlInformation = urlInformation;
        this.irlInformation = irlInformation;
        this.addressInformation = addressInformation;
        this.addAt = LocalDateTime.now();
        this.lastModification = LocalDateTime.now();
        this.group = group;

        this.pasword = pasword;
    }
    */

    public Entity(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return login.equals(entity.login) &&
                name.equals(entity.name) &&
                password.equals(entity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, password);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


