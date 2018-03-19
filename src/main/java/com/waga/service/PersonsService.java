package com.waga.service;

import com.waga.model.House;
import com.waga.model.Person;
import com.waga.repository.PersonsRepository;
import com.waga.service.api.PersonsServiceApi;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:20:22 PM
 */
@Service
public class PersonsService implements PersonsServiceApi {

    private final PersonsRepository personsRepository;

    public PersonsService(final PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @Override
    public Optional<House> fetchPersonHouse(final Long personId) {
        final Person person = personsRepository.findOne(personId);
        if (person == null) {
            return Optional.empty();
        }
        return Optional.of(person.getHouse());
    }

}
