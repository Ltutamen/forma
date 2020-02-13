package ua.axiom.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private List<Entity> entities;

    public Model() {
        entities = new LinkedList<Entity>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }
}
