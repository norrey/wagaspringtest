package com.waga.repository;

import com.waga.model.House;
import com.waga.model.Person;
import com.waga.util.HouseType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Feb 12, 2018, 5:40:34 PM
 */
@DataJpaTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PersonRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private PersonsRepository personsRepository;

    @Before
    public void setup() {
        logger.info("Setting up.");
    }

    @After
    public void tearDown() {
        logger.info("Closing resources.");
    }

    @Test
    public void testInsertPerson() {
        Person managedPerson = testEntityManager.persist(prepareDummyPerson());
        Person retrievedPerson = personsRepository.findOne(managedPerson.getId());

        assertThat(retrievedPerson.getName()).isEqualTo("Test Name");
    }

    public Person prepareDummyPerson() {
        final Person person = new Person();
        person.setAge(30);
        person.setName("Test Name");

        House house = new House();
        house.setAddress("New Address");
        house.setHouseType(HouseType.HOUSE);
        house.setZipCode("1234567");

        person.setHouse(house);

        return person;
    }

}
