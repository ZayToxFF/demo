package com.example.models;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Discipline {

    private Integer id;
    private String name;
    private String description;

    public Discipline(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ObservableList<Discipline> getDisciplines() {
        ObservableList<Discipline> disciplines = FXCollections.observableArrayList();
        return disciplines;
    }

    @Override
    public String toString() {
        return "Discipline{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
