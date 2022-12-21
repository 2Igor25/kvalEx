package com.server.kval.domain;

public enum AgeLimit {
    ZERO_PLUS ("0+"),
    SIX_PLUS ("6+"),
    TWELVE_PLUS("12+"),
    SIXTEEN_PLUS("16+"),
    EIGHTEEN_PLUS("18+"),
    NO_RESTRICTIONS("без ограничений");

    private final String name;

    AgeLimit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
