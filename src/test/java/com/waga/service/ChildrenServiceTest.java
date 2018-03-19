package com.waga.service;

import com.waga.model.Child;
import com.waga.model.ChildInfo;
import com.waga.model.House;
import com.waga.model.Meal;
import com.waga.model.Person;
import com.waga.model.Son;
import com.waga.repository.ChildrenRepository;
import com.waga.service.api.ChildrenServiceApi;
import com.waga.util.HouseType;
import java.util.Calendar;
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
public class ChildrenServiceTest {

    @Autowired
    private ChildrenServiceApi childrenServiceApi;

    @MockBean
    private ChildrenRepository childrenRepository;

    @Before
    public void setup() {
        Mockito.when(childrenRepository.findOne(1l))
                .thenReturn(setupDummyChild());
    }

    @Test
    public void testRetrieveChildInfo() {
        Optional<ChildInfo> childInfo = childrenServiceApi.fetchChildInfo(1l);
        assertTrue(childInfo.isPresent());
        assertThat(childInfo.get().getParent().getName()).isEqualTo("Test Name");
    }

    @Test
    public void testRetriveChildColor() {
        Optional<String> childColor = childrenServiceApi.fetchChildColor(1l);
        assertTrue(childColor.isPresent());
        assertThat(childColor.get()).isEqualTo("Red");
    }

    private Child setupDummyChild() {
        Child child = new Son();
        child.setAge(1);
        child.setName("Treasure1");
        child.setParent(setupDummyParent());
        ((Son) child).setBicycleColor("Red");

        setupDummyMeals(child);

        return child;
    }

    private Person setupDummyParent() {

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

    private void setupDummyMeals(final Child child) {
        Meal meal = new Meal();
        meal.setName("Dummy Meal 1");
        meal.setPriority(1);
        meal.setInvented(Calendar.getInstance().getTime());

        Meal meal2 = new Meal();
        meal2.setName("Dummy Meal 2");
        meal2.setPriority(0);
        meal2.setInvented(Calendar.getInstance().getTime());

        child.addMeal(meal);
        child.addMeal(meal2);
    }

}
