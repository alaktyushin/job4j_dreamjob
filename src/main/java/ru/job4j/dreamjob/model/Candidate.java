package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;

public record Candidate(int id, String name, String description, LocalDateTime created) {
}
