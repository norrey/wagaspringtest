package com.waga.service.api;

import com.waga.model.House;
import java.util.Optional;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:19:20 PM
 */
public interface PersonsServiceApi {

    Optional<House> fetchPersonHouse(final Long personId);

}
