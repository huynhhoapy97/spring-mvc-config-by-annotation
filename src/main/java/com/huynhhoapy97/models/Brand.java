package com.huynhhoapy97.models;

import org.springframework.stereotype.Component;

@Component
public class Brand {
    private String id;
    private String name;

    public Brand() {
        this.id = "003";
        this.name = "Evogen";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
