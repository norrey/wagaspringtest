package com.waga.model;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.persistence.Cacheable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import lombok.Data;
import org.hibernate.annotations.SortNatural;

import static javax.persistence.CascadeType.ALL;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:06:59 PM
 *
 */
@Data
@Entity
@Inheritance
@Cacheable
@DiscriminatorColumn(name = "child_type", discriminatorType = DiscriminatorType.INTEGER)
public class Child implements Serializable {

    private static final long serialVersionUID = 8354651821295486407L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    @SortNatural
    @OrderBy("priority ASC")
    @OneToMany(cascade = ALL, mappedBy = "child", fetch = FetchType.LAZY)
    private SortedSet<Meal> meals = new TreeSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Person parent;

    public void addMeal(final Meal meal) {
        meals.add(meal);
        meal.setChild(this);
    }

}
