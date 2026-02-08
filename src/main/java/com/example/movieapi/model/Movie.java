package com.example.movieapi.model;

public class Movie {

    private int id;
    private String name;
    private String description;
    private int releaseYear;

    public Movie() {}

    public Movie(int id, String name, String description, int releaseYear) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
