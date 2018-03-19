package com.waga.service;

import com.waga.model.House;
import com.waga.model.Person;
import com.waga.repository.PersonsRepository;
import com.waga.service.api.PersonsServiceApi;
import com.waga.util.HouseType;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 19, 2018, 2:47:36 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonServiceTest {

    @Autowired
    private PersonsServiceApi personsServiceApi;

    @MockBean
    private PersonsRepository personsRepository;

    @Before
    public void setup() {
        Mockito.when(personsRepository.findOne(1l))
                .thenReturn(setupDummyPerson());
    }

    @Test
    public void testRetrieveChildInfo() {
        Optional<House> childInfo = personsServiceApi.fetchPersonHouse(1l);
        assertTrue(childInfo.isPresent());
        assertThat(childInfo.get().getZipCode()).isEqualTo("1234567");
    }

    private Person setupDummyPerson() {

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
