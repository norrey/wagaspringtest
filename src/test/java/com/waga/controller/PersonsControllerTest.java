package com.waga.controller;

import com.waga.model.House;
import com.waga.util.HouseType;
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
public class PersonsControllerTest {

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
    public void testSuccessfulPersonHouseRequest() {
        final House house = testRestTemplate.getForObject("/persons/1/house", House.class);
        assertThat(house.getHouseType()).isEqualTo(HouseType.FLAT);
    }

}
