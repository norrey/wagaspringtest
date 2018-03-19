package com.waga.model;

import javax.persistence.Cacheable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 16, 2018, 4:20:44 PM
 */
@Data
@Entity
@Cacheable
@DiscriminatorValue("2")
public class Daughter extends Child {

    private static final long serialVersionUID = 1796148771156077579L;

    private String hairColor;

}
