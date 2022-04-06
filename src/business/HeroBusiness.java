package business;

import java.util.List;
import java.util.Optional;

import model.Hero;

public interface HeroBusiness {
	/**
     * Get hero by id
     *
     * @param id hero identifiant
     * @return hero find by id
     */
    Optional<Hero> get(String id);

    /**
     * Get heros list
     *
     * @return list of heros
     */
    List<Hero> getList();
}
