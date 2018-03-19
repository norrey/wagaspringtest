package com.waga.model;

import javax.persistence.Cacheable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 16, 2018, 4:20:22 PM
 */
@Data
@Entity
@Cacheable
@DiscriminatorValue("1")
public class Son extends Child {

    private static final long serialVersionUID = -1014372717073621214L;

    private String bicycleColor;

}
