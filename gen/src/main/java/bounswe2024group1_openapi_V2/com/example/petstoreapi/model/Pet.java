package com.example.petstoreapi.model;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Pet {

    @NotNull
    private Long id;
    private String name;
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getId(), pet.getId()) &&
                Objects.equals(getName(), pet.getName()) &&
                Objects.equals(getTag(), pet.getTag());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTag());
    }
}

