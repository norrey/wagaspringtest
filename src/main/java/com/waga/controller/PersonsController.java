package com.waga.controller;

import com.waga.model.House;
import com.waga.service.api.PersonsServiceApi;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 10:42:43 PM
 */
@RestController
public class PersonsController {

    private final PersonsServiceApi personsServiceApi;

    public PersonsController(final PersonsServiceApi personsServiceApi) {
        this.personsServiceApi = personsServiceApi;
    }

    @GetMapping(value = "/persons/{person_id}/house")
    public ResponseEntity<House> fetchPersonsHouse(@PathVariable("person_id") final Long personId) {
        final Optional<House> house = personsServiceApi.fetchPersonHouse(personId);
        if (!house.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(house.get(), HttpStatus.OK);
    }

}
