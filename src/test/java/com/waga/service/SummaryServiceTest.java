package com.waga.service;

import com.waga.model.ParentSummary;
import com.waga.repository.ParentSummaryRepository;
import com.waga.service.api.SummaryServiceApi;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 19, 2018, 2:47:36 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SummaryServiceTest {

    @Autowired
    private SummaryServiceApi summaryServiceApi;

    @MockBean
    private ParentSummaryRepository parentSummaryRepository;

    @Before
    public void setup() {
        Mockito.when(parentSummaryRepository.findAll())
                .thenReturn(setupSampleParentChildSummary());
    }

    @Test
    public void testRetrieveStatistics() {
        final int[] summary = summaryServiceApi.retrieveParentChildStatistics();
        assertThat(summary[0]).isEqualTo(2);
        assertThat(summary[1]).isEqualTo(5);
    }

    private List<ParentSummary> setupSampleParentChildSummary() {
        return Arrays.asList(new ParentSummary(1l, 2l, 0l), new ParentSummary(2l, 5l, 1l));
    }

}
