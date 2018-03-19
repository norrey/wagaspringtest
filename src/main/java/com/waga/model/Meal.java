package com.waga.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:09:52 PM
 */
@Data
@Entity
@Cacheable
public class Meal implements Serializable, Comparable<Meal> {

    private static final long serialVersionUID = -8048090479120967262L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date invented;

    private int priority;

    @JsonIgnore
    @JoinColumn(name = "child_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Child child;

    @Override
    public int compareTo(final Meal other) {
        return this.getPriority() - other.getPriority();
    }

}
