package com.waga.service.api;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 17, 2018, 1:16:31 AM
 */
public interface SummaryServiceApi {

    void summarizeParentChildStatistics();

    int[] retrieveParentChildStatistics();
}
