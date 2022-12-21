package com.server.kval.domain;

public enum UserRole {
    USER("клиент"),
    ADMIN("старший менеджер"),
    MANAGER("менеджер");

    private final String name;

    UserRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
