package com.waga.repository;

import com.waga.model.Child;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class ChildRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ChildrenRepository roleRepository;

    @Before
    public void setup() {

    }

    @Test
    public void testInsertChild() {
        Child child = new Child();
        child.setName("Test Name");
        Child managedChild = testEntityManager.persist(child);
        Child savedChild = roleRepository.findOne(managedChild.getId());
        assertThat(savedChild.getName()).isEqualTo("Test Name");
    }

}
