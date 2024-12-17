package org.example.entity;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers") ,
    COMMENTARARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");


    private final String value;

    Feature (String name) {
        this.value = name;
    }
    public String getValue() {
        return value;
    }
    public static Feature getFeature(String name) {
        if(isNull(name) || name.isEmpty()) {
            return null;
        }
        for (Feature feature : Feature.values()) {
            if (feature.getValue().equals(name)) {
                return feature;
            }
        }
        return null;
    }
}
