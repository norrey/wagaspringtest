package com.waga.repository;

import com.waga.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:22:28 PM
 */
@Repository
public interface PersonsRepository extends JpaRepository<Person, Long> {

}
