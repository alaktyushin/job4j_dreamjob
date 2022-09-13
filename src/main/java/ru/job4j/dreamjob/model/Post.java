package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;

public final class Post {
    private final int id;
    private final String name;
    private final String description;
    private final LocalDateTime created;

    public Post(int id, String name) {
        this.id = id;
        this.name = name;
        this.description = "";
        this.created = LocalDateTime.now();
    }

    public Post(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = LocalDateTime.now();
    }

    public String getDescription() {
        return description.isEmpty() ? "No description" : description;
    }

    public String getCreated() {
        return String.valueOf(created.getDayOfMonth())
                .concat(" - ")
                .concat(String.valueOf(created.getMonth()))
                .concat(" - ")
                .concat(String.valueOf(created.getYear()));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

