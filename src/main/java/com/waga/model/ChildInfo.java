package com.waga.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 16, 2018, 1:49:21 AM
 */
@Data
@AllArgsConstructor
public class ChildInfo {

    private Person parent;
    
    private Meal favoriteMeal;

}
