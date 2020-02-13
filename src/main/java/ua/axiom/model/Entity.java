package ua.axiom.model;

import ua.axiom.model.personalData.*;

import java.time.LocalDateTime;


public class Entity {
    enum ENTITY_GROUP{FAMILY, WORK, FRIENDS}

    private final NominalInformation nominalInformation;
    private final URLInformation urlInformation;
    private final IRLInformation irlInformation;
    private final AddressInformation addressInformation;
    private String address;
    private final LocalDateTime addAt;
    private LocalDateTime lastModification;
    private String comment;
    private final ENTITY_GROUP group;

    public Entity(NominalInformation nominalInformation, URLInformation urlInformation, IRLInformation irlInformation, AddressInformation addressInformation, ENTITY_GROUP group) {
        this.nominalInformation = nominalInformation;
        this.urlInformation = urlInformation;
        this.irlInformation = irlInformation;
        this.addressInformation = addressInformation;
        this.addAt = LocalDateTime.now();
        this.lastModification = LocalDateTime.now();
        this.group = group;
    }

    public void addComment(String comment) {
        this.comment = comment;
    }
}
