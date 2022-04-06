package business;

import java.util.List;
import java.util.Optional;

import model.Award;

public interface AwardBusiness {
	/**
     * Get award of 2020 by id
     *
     * @param id 2020 award identifiant
     * @return 2020 award find by id
     */
    Optional<Award> get20(String id);
    
    /**
     * Get award of 2021 by id
     *
     * @param id 2021 award identifiant
     * @return 2021 award find by id
     */
    Optional<Award> get21(String id);
    
    /**
     * Get award of 2022 by id
     *
     * @param id 2022 award identifiant
     * @return 2022 award find by id
     */
    Optional<Award> get22(String id);

    /**
     * Get 2020 awards list
     *
     * @return list of awards of 2020
     */
    List<Award> getList2020();
    
    /**
     * Get 2021 awards list
     *
     * @return list of awards of 2021
     */
    List<Award> getList2021();
    
    /**
     * Get 2022 awards list
     *
     * @return list of awards 2022
     */
    List<Award> getList2022();
}
