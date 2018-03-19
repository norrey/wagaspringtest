package com.waga.schedule;

import com.waga.service.api.SummaryServiceApi;
import javax.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 16, 2018, 5:39:07 PM
 */
@Component
public class ParentSummarySchedule {

    private final SummaryServiceApi summaryServiceApi;

    public ParentSummarySchedule(final SummaryServiceApi summaryServiceApi) {
        this.summaryServiceApi = summaryServiceApi;
    }

    @PostConstruct
    public void onStartup() {
        summaryServiceApi.summarizeParentChildStatistics();
    }

    @Scheduled(cron = "0 0/15 * * * *")
    public void summarizeParentChildInfo() {
        summaryServiceApi.summarizeParentChildStatistics();
    }
}
