package ua.axiom.model;

import java.util.*;

public class Model {
    private Set<Entity> entities;

    public Model() {
        entities = new HashSet<Entity>();
    }

    public void addEntity(Entity entity) throws EntityAlreadyExistException {
        if(!isValid(entity.login)) {
            throw new EntityAlreadyExistException(entity);
        }
        entities.add(entity);
    }

    /**
     *  Returns true, if given login is not yet present in the system
     * @param login that is about to be checked
     * @return true if given login can be added
     */
    public boolean isValid(String login) {
        return entities.stream().map(e -> e.login).noneMatch(l -> l.equals(login));
    }




}
