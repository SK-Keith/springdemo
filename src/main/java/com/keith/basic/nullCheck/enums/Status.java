package com.keith.basic.nullCheck.enums;

public enum Status {
    NEW(0),RUNNABLE(1),RUNNING(2),BLOCKED(3),DEAD(4);

    public int statusCode;

    Status(int statusCode) {
        this.statusCode = statusCode;
    }

}
