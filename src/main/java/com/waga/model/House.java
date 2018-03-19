package com.waga.model;

import com.waga.util.HouseType;
import java.io.Serializable;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 10:58:55 PM
 */
@Data
@Entity
@Cacheable
public class House implements Serializable {

    private static final long serialVersionUID = 4873876310228013435L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private String zipCode;

    private HouseType houseType;

}
