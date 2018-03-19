package com.waga.util;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:01:55 PM
 */
public enum HouseType {

    FLAT("Flat"),
    HOUSE("House"),
    ESTATE("Estate");

    private final String name;

    private HouseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
