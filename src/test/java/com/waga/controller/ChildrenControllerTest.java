package com.waga.controller;

import com.waga.model.ChildInfo;
import java.util.Map;
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

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ChildrenControllerTest {

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
        final ChildInfo childInfo = testRestTemplate.getForObject("/children/1/info", ChildInfo.class);
        assertThat(childInfo.getParent().getName()).isEqualTo("Miss Celia Strosin");
    }

    @Test
    public void testSuccessfulChildColor() {
        @SuppressWarnings("unchecked")
        final Map<String, String> colorResponse = testRestTemplate.getForObject("/children/1/color", Map.class);
        assertThat(colorResponse.get("color")).isEqualTo("enim");
    }

}
