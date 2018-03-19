package com.waga.service;

import com.waga.model.ParentSummary;
import com.waga.repository.ChildrenRepository;
import com.waga.repository.ParentSummaryRepository;
import com.waga.service.api.SummaryServiceApi;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 17, 2018, 1:15:55 AM
 */
@Service
public class SummaryService implements SummaryServiceApi {

    @Autowired
    private ChildrenRepository childrenRepository;

    @Autowired
    private ParentSummaryRepository parentSummaryRepository;

    @Override
    @Transactional
    public void summarizeParentChildStatistics() {
        childrenRepository.summarizeParentChildStatistics();
    }

    @Override
    public int[] retrieveParentChildStatistics() {
        List<ParentSummary> parentSummaryList = parentSummaryRepository.findAll();
        if (parentSummaryList == null || parentSummaryList.isEmpty()) {
            return new int[]{};
        }

        final int max = parentSummaryList.stream().mapToInt(summary -> summary.getAmountOfChildren().intValue()).max().getAsInt();
        final int[] parentChildSummary = new int[max + 1];

        parentSummaryList.stream().forEach(summary -> {
            parentChildSummary[summary.getAmountOfChildren().intValue()] = summary.getAmountOfPersons().intValue();
        });
        return parentChildSummary;
    }

}
