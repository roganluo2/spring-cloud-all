package com.gupaoedu.service.server.entity;

import java.io.Serializable;
import java.util.StringJoiner;

public class Person implements Serializable {

    private String name;

    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("id=" + id)
                .toString();
    }
}
