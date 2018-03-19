package com.waga.controller;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SummaryControllerTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setup() {
        logger.info("Setting up.");
    }

    @After
    public void tearDown() {
        logger.info("Closing resources.");
    }

    @Test
    public void testSuccessfulChildInfo() {
        @SuppressWarnings("unchecked")
        final List<Integer> summary = testRestTemplate.getForObject("/persons/children", List.class);
        assertThat(summary.size()).isEqualTo(6);
    }

}
