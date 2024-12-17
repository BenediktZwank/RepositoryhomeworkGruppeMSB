package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EntityManager<T> {

    private List<T> entities;

    public EntityManager(){

        this.entities = new ArrayList<>();
    }

    public void addEntity(T data){

        entities.add(data);
    }

    public List<T> getAllEntities(){

        return entities;
    }

    // Methode, um eine Entität anhand eines Kriteriums zu finden
    public T findEntityByCriterion(Predicate<T> criterion) {
        for (T entity : entities) {
            if (criterion.test(entity)) {
                return entity;
            }
        }
        return null; // Gibt null zurück, wenn keine Entität gefunden wurde
    }

}
