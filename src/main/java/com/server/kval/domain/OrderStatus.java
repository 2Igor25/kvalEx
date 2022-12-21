package com.server.kval.domain;

public enum OrderStatus {
    NEW ("новый"),
    IN_PROGRESS ("в обработке"),
    CANCELLED ("отменен"),
    CLOSE ("закрыт");

    private final String name;

    OrderStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
