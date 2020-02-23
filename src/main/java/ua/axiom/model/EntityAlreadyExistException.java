package ua.axiom.model;

import java.io.IOException;

public class EntityAlreadyExistException extends IOException {
    private Entity failedEntity;

    public EntityAlreadyExistException(Entity e) {
        super();
        this.failedEntity = e;

    }

    @Override
    public String getMessage() {
        return "Entity with such login already exist in the system.\n" + failedEntity.toString();
    }
}
