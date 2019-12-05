package com.gupaoedu.service.client.entity;

import com.google.common.base.Objects;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {


        this.id = id;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("id", id)
                .toString();
    }
}
