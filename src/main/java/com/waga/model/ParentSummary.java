package com.waga.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 16, 2018, 4:33:29 PM
 */
@Data
@Entity
public class ParentSummary implements Serializable {

    private static final long serialVersionUID = 7201656330879203057L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "num_parents")
    private Long amountOfPersons;

    @Column(name = "num_children")
    private Long amountOfChildren;

    public ParentSummary() {
    }

    public ParentSummary(final Long id, final Long amountOfPersons, final Long amountOfChildren) {
        this.id = id;
        this.amountOfPersons = amountOfPersons;
        this.amountOfChildren = amountOfChildren;
    }

}
