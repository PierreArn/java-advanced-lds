package business;

import java.util.List;
import java.util.Optional;

import model.Actor;

public interface ActorBusiness {
	/**
     * Get actor by id
     *
     * @param id actor identifiant
     * @return actor find by id
     */
    Optional<Actor> get(String id);

    /**
     * Get actors list
     *
     * @return list of actors
     */
    List<Actor> getList();
}
