package com.waga.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 10:55:47 PM
 */
@Data
@Entity
@Cacheable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person implements Serializable {

    private static final long serialVersionUID = 5393216125145326178L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    @OneToOne(cascade = ALL, orphanRemoval = true, fetch = EAGER)
    private House house;

}
