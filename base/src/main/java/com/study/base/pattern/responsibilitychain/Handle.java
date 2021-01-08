package com.study.base.pattern.responsibilitychain;

public abstract class Handle {
    private Handle next;

    public abstract void handleRequest(final int day);

    public Handle getNext() {
        return next;
    }

    public void setNext(Handle next) {
        this.next = next;
    }
}
