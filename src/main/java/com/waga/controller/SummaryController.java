package com.waga.controller;

import com.waga.service.api.SummaryServiceApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 17, 2018, 1:13:51 AM
 */
@RestController
public class SummaryController {

    private final SummaryServiceApi summaryServiceApi;

    public SummaryController(final SummaryServiceApi summaryServiceApi) {
        this.summaryServiceApi = summaryServiceApi;
    }

    @GetMapping(value = "/persons/children")
    public ResponseEntity<int[]> fetchParentChildStatistics() {
        return new ResponseEntity<>(summaryServiceApi.retrieveParentChildStatistics(), HttpStatus.OK);
    }
}
