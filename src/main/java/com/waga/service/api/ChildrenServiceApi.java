package com.waga.service.api;

import com.waga.model.ChildInfo;
import java.util.Optional;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:19:38 PM
 */
public interface ChildrenServiceApi {

    Optional<ChildInfo> fetchChildInfo(final Long childId);

    Optional<String> fetchChildColor(final Long childId);

}
